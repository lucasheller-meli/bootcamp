package com.tarde.lista3ex1;

public class RunPersonagem {

    public static void main(String[] args) {
        Personagem p1 = new Personagem();
        p1.setArma(new ArcoFlecha());
        p1.setClasseDoPersonagem(Classe.GUERREIRO);
        p1.setNome("guerreiro com arco e flecha");

        p1.getArma().usar();

        p1.setArma(new Espada());
        p1.getArma().usar();

        p1.setArma(new Cajado());
        p1.getArma().usar();
    }
}
