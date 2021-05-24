package com.tarde.lista3ex1;

public class Personagem {

    private String nome;

    private Classe classeDoPersonagem;

    private Arma arma;

    private int vida;

    private int nivel;

    public String getNome() {
        return nome;
    }

    public Classe getClasseDoPersonagem() {
        return classeDoPersonagem;
    }

    public Arma getArma() {
        return arma;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasseDoPersonagem(Classe classeDoPersonagem) {
        this.classeDoPersonagem = classeDoPersonagem;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
