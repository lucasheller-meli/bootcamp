package com.laChiqui;

public class ConvidadoStandart extends Convidados{

    public ConvidadoStandart(String nome) {
        super(nome);
    }

    @Override
    public void comerBolo() {
        System.out.println(nome + " comeu bolo!");
    }
}
