package Manha.Dakar;

public class Carros extends Veiculo{
    //Classe filha de veiculo com os parametros fixos setados no construtor (roda e peso)
    public Carros(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, 4, 1000.0);
    }
}
