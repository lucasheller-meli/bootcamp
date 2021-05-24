package com.tarde.lista3ex1;

public class Espada extends Arma {

    private int poder;

    public Espada() {
        this.nome = "Espada";
        this.poder = 18;
    }

    @Override
    public int usar() {
        if(poder > 0 ) {
            poder--;
            System.out.println("cortei com a espada");
            return 8;
        }
        System.out.println("minha espada não funciona");
        return 0;
    }

}
