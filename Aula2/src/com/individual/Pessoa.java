package com.individual;

public class Pessoa implements Precedente<Pessoa> {

    private String nome;

    private long cpf;

    public Pessoa(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    @Override
    public boolean precedeA(Pessoa a) {
        return this.cpf < a.getCpf();
    }
}
