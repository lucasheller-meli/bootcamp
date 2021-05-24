package com.tarde.lista3ex1;

public class Cajado extends Arma {

    private int mana;

    public Cajado() {
        this.nome = "Cajado";
        this.mana = 15;
    }

    @Override
    public int usar() {
        if (mana > 0) {
            mana--;
            System.out.println("Bati com o cajado");
            return 15;
        }
        System.out.println("cajado quebrou");
        return 0;
    }

}
