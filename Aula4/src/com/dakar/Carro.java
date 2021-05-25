package com.dakar;

public class Carro extends Veiculo {
    public Carro(Double velocidade, Double acelerecao, Double anguloDeGiro, String placa) {
        super(velocidade, acelerecao, anguloDeGiro, placa, 1000.0, 4);
    }
}
