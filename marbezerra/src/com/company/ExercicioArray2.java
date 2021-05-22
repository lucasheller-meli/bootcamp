package com.company;

public class ExercicioArray2 {

    public static void main(String[] args){
        Empresa empresa = new Empresa("Empresa X", 1.13, 148);
        Empresa empresa1 = new Empresa("Empresa Y", 18.8, 32);

        int anoAtual = 2021;

        while (empresa1.getValor() >= empresa.getValor()){
            empresa.crescimentoAtualizado();
            empresa1.crescimentoAtualizado();
            empresa.report(anoAtual);
            empresa1.report(anoAtual);

            anoAtual++;
        }
    }
}

class Empresa{
    private final String nome;
    private double valor;
    private final float crescimento;

    public Empresa(String nome, double valor, float crescimento){
        this.nome = nome;
        this.valor = valor;
        this.crescimento = crescimento;
    }

    public void report(int ano){
        System.out.println("Empresa " + nome + " 01/01" + ano + "- Valor da Empresa " + String.format("%.2f", this.valor) + "m");
    }

    public void crescimentoAtualizado(){
        this.valor = this.valor + (this.valor * crescimento);
    }

    public double getValor() { return valor; }
}