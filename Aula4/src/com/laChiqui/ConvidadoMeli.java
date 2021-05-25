package com.laChiqui;

public class ConvidadoMeli extends Convidados {

    public ConvidadoMeli(String nome) {
        super(nome);
    }

    @Override
    public void comerBolo() {
        System.out.println(nome + " comeu bolo e gritou VIVA LA CHIQUi!");
    }
}
