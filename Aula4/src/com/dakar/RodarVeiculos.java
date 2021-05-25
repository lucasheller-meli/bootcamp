package com.dakar;

public class RodarVeiculos {

    public static void main(String[] args) {



        Corrida corrida = new Corrida();
        corrida.setQtdVeiculosPermitidos(10);
        corrida.setDistancia(20.0);
        corrida.setNome("CORRIDA ");
        corrida.setPremioEmReais(1000.50);
        corrida.registrarCarro(100.0, 100.0, 100.0, "ABC-123");
        corrida.registrarMoto(100.0, 100.0, 100.0, "ABC-223");
        corrida.verificarVencedor();

    }
}
