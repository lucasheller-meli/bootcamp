package Manha.Dakar;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class Corrida {
    private Double distancia;
    private Double premioemDolares;
    private String nome;
    private Integer quantidadedeVeiculosPermitidos;
    //Instancio o abjeto vazio com o new
    private List<Veiculo> veiculo = new ArrayList<>();
    private Socorrista<Carros> socorristaCarro = new SocorristaCarro();
    private Socorrista<Motos> socorristaMoto = new SocorristaMoto();

    public Corrida(Double distancia, Double premioemDolares, String nome, Integer quantidadedeVeiculosPermitidos, List<Veiculo> veiculo) {
        this.distancia = distancia;
        this.premioemDolares = premioemDolares;
        this.nome = nome;
        this.quantidadedeVeiculosPermitidos = quantidadedeVeiculosPermitidos;
        this.veiculo = veiculo;
    }

    public Corrida(){}

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getPremioemDolares() {
        return premioemDolares;
    }

    public void setPremioemDolares(Double premioemDolares) {
        this.premioemDolares = premioemDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadedeVeiculosPermitidos() {
        return quantidadedeVeiculosPermitidos;
    }

    public void setQuantidadedeVeiculosPermitidos(Integer quantidadedeVeiculosPermitidos) {
        this.quantidadedeVeiculosPermitidos = quantidadedeVeiculosPermitidos;
    }

    public List<Veiculo> getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(List<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }

    public void registrarCarro(Double velocidade, Double aceleracao, Double anguloGiro, String placa){
        //registrado o veiculo na corrida se ainda tiver vaga
        if(this.veiculo.size() >= this.quantidadedeVeiculosPermitidos){
            System.out.println("Quantidade de Veiculo nao permitida,");
        }else {
            //instacia o carro com os dados fornecidos
            this.veiculo.add(new Carros(velocidade, aceleracao, anguloGiro, placa));
        }
    }

    public void registrarMoto(Double velocidade, Double aceleracao, Double anguloGiro, String placa){
        if(this.veiculo.size() >= this.quantidadedeVeiculosPermitidos){
            System.out.println("Quantidade de Veiculo nao permitida,");
        }else {
            this.veiculo.add(new Motos(velocidade, aceleracao, anguloGiro, placa));
        }
    }

    public void removerVeiculo(String placa){
        //pela placa identifico o veiculo a ser removido
        //se acha o veiculo executa removerVeiculo caso contrario sout
        this.veiculo.stream().filter(v -> placa.equalsIgnoreCase(v.getPlaca()))
        .findFirst()
        .ifPresentOrElse(this::removerVeiculo, () ->
                System.out.println("A placa do veiculo nao foi encontrada."));
    }

    private void removerVeiculo(Veiculo veiculo) {
        //remove o veiculo da lista
        this.veiculo.remove(veiculo);
    }

    public void verificarVencedor(){
        //verifica a velociade maior e mostra o veiculo
        final AtomicReference<Veiculo> veiculo = new AtomicReference<Veiculo>();
        final AtomicReference<Double> velocidadeVencedor = new AtomicReference<>(0.0);

        this.veiculo.stream().forEach(v -> {
            var velocidadeAtual = v.getVelocidade() + v.getAceleracao() / (v.getAnguloDeGiro() * (v.getPeso() - v.getRodas() * 100));
            if(velocidadeAtual > velocidadeVencedor.get()){
                velocidadeVencedor.set(velocidadeAtual);
                veiculo.set(v);

            }
        });
        System.out.println("O vencedor e o veiculo:" + veiculo);
    }

    public Optional<Veiculo> pegarVeiculoPlaca(String placa){
        return this.veiculo.stream().filter(v -> placa.equalsIgnoreCase(v.getPlaca()))
                .findFirst();
    }

    public void socorrer(String placa){
        //socorre o veiculo com a placa
        Optional<Veiculo> veiculo = pegarVeiculoPlaca(placa);
        //verifica se existe o veiculo
        if(veiculo.isEmpty()){
            System.out.println("Veiculo nao encontrado pela placa");
            return;
        }
        //Verifica se eh carro ou moto
        Veiculo v = veiculo.get();
        if(v instanceof Carros){
            socorrerCarro((Carros) v);
        }if(v instanceof  Motos){
            socorrerMoto((Motos) v);
        }
    }

    private void socorrerCarro(Carros carros){
        //chama o socorre da classe carro
        socorristaCarro.socorrer(carros);
    }

    private void socorrerMoto(Motos motos){
        socorristaMoto.socorrer(motos);
    }


}
