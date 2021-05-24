package com.tarde.lista3ex1;

public class ArcoFlecha extends Arma {

    int quantidadeFechas;


    public ArcoFlecha() {
        this.quantidadeFechas = 10;
        this.nome = "Arco e Flecha";
    }

    @Override
    public int usar() {
        if(quantidadeFechas > 0) {
            System.out.println("atirei uma flecha");
            quantidadeFechas--;
            return 12;
        }
            System.out.println("estou sem flechas!");
            return 0;


    }

}
