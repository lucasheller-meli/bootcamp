package com.dakar;

public class Veiculo {

    private Double velocidade;
    private Double acelerecao;
    private Double anguloDeGiro;
    private String placa;
    private Double peso;
    private Integer rodas;


    public Veiculo(Double velocidade, Double acelerecao, Double anguloDeGiro, String placa, Double peso, Integer rodas) {
        this.velocidade = velocidade;
        this.acelerecao = acelerecao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public Veiculo() {
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public Double getAcelerecao() {
        return acelerecao;
    }

    public void setAcelerecao(Double acelerecao) {
        this.acelerecao = acelerecao;
    }

    public Double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(Double anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getRodas() {
        return rodas;
    }

    public void setRodas(Integer rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", acelerecao=" + acelerecao +
                ", anguloDeGiro=" + anguloDeGiro +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }
}
