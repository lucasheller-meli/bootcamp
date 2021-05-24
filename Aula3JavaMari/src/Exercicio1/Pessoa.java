package Exercicio1;

public class Pessoa implements Precedente<Pessoa>{

    private String nome;
    private double cpf;

    public Pessoa(String nome, double cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public double getCpf() { return cpf; }

    public void setCpf(double cpf) { this.cpf = cpf; }

    @Override
    public int precedeA(Pessoa pessoa) {
        return pessoa.nome.compareTo(this.nome) > 0 ? 1:0;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }

    @Override
    public String imprimir() {
        return this.nome;
        //return this
    }
}
