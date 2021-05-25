package Manha.Dakar;

public class Motos extends Veiculo{
    //Classe filha settando os parametros de roda e peso padrao da moto
    public Motos(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, 2, 300.0);
    }
}
