package com.dakar;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Corrida {

    private Double distancia;
    private Double premioEmReais;
    private String nome;
    private Integer qtdVeiculosPermitidos;
    private List<Veiculo> veiculos = new ArrayList<>();

    public Corrida(Double distancia, Double premioEmReais, String nome, Integer qtdVeiculosPermitidos, List<Veiculo> veiculos) {
        this.distancia = distancia;
        this.premioEmReais = premioEmReais;
        this.nome = nome;
        this.qtdVeiculosPermitidos = qtdVeiculosPermitidos;
        this.veiculos = veiculos;
    }

    public Corrida() {
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getPremioEmReais() {
        return premioEmReais;
    }

    public void setPremioEmReais(Double premioEmReais) {
        this.premioEmReais = premioEmReais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdVeiculosPermitidos() {
        return qtdVeiculosPermitidos;
    }

    public void setQtdVeiculosPermitidos(Integer qtdVeiculosPermitidos) {
        this.qtdVeiculosPermitidos = qtdVeiculosPermitidos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void registrarCarro(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        if (this.veiculos.size() >= this.qtdVeiculosPermitidos) {
            System.out.println("Nao é possivel adicionar novos veiculos nessa corrida");
        } else {
            this.veiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
        }
    }

    public void registrarMoto(Double velocidade, Double aceleracao, Double anguloDeGiro, String placa) {
        if (this.veiculos.size() >= this.qtdVeiculosPermitidos) {
            System.out.println("Nao é possivel adicionar novos veiculos nessa corrida");
        } else {
            this.veiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        this.veiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa) {
        this.veiculos.stream()
                .filter(v -> placa.equalsIgnoreCase(v.getPlaca()))
                .findFirst()
                .ifPresentOrElse(this::removerVeiculo, () ->
                        System.out.println("Placa de veiculo nao encontrado")
                );
    }

    public void verificarVencedor(){
        final AtomicReference<Veiculo> veiculo = new AtomicReference<Veiculo>();
        final AtomicReference<Double> velocidadeVencedor = new AtomicReference<>(0.0);

        this.veiculos.forEach(v -> {
            var velocidadeAtual = v.getVelocidade() * v.getAcelerecao() / (v.getAnguloDeGiro() * (v.getPeso() - v.getRodas() * 100));
            if(velocidadeAtual > velocidadeVencedor.get()){
                velocidadeVencedor.set(velocidadeAtual);
                veiculo.set(v);
            }
        });

        System.out.println("O vencedor é o veiculo "+veiculo);
    }



}
