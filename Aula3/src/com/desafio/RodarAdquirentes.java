package com.desafio;

public class RodarAdquirentes {
    public static void main(String[] args) {
        Adquirentes cielo = new Cielo();
        System.out.println(cielo.verificaTaxa());
        Adquirentes stone = new Stone();
        System.out.println(stone.verificaTaxa());
    }
}
