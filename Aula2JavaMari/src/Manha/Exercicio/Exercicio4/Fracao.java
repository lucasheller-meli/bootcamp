package Manha.Exercicio.Exercicio4;

public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public int getNumerador() {
        return numerador;
    }
    public int getDenominador() {
        return denominador;
    }
    public void adicionar(Fracao f){
        this.numerador = (((f.getDenominador() * denominador)/denominador)*numerador + ((f.getDenominador() * denominador)/f.getDenominador())*f.getNumerador());
        this.denominador = (f.getDenominador() * denominador);
    }
    public void adicionar(int n){
        this.numerador = numerador + (numerador*n);
    }
    public void subtrair(int n){
        this.numerador = numerador - (numerador*n);
    }
    public void subtrair(Fracao f){
        this.numerador = (((f.denominador * denominador)/denominador)*numerador - ((f.denominador * denominador)/f.denominador)*f.numerador);
        this.denominador = (f.denominador * denominador);
    }
    public void multiplicar(int n){
        this.numerador = numerador * n;
    }
    public void multiplicar(Fracao f){
        this.numerador = numerador*f.numerador;
        this.denominador = denominador*f.denominador;
    }
    public void dividir(int n){
        this.denominador = denominador*n;
    }

}
