package com.desafio;

public class RodarAdquirentes {
    public static void main(String[] args) {
        final Adquirentes cielo = new Cielo();
        System.out.println(cielo.verificaTaxa());
        final Adquirentes stone = new Stone();
        System.out.println(stone.verificaTaxa());
    }
}
