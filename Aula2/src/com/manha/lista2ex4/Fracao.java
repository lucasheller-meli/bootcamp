
public class Fracao {

    private int numerador;
    private int denominador;

    public Fracao(int n, int d) {
        numerador = n;
        denominador = d;
    }

    @Override
    public String toString() {
        return "Fracao{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }

    public void somar(Fracao f) {
        int denominadorAnterior = denominador;
        this.denominador = denominador * f.denominador;
        this.numerador = (denominador / denominadorAnterior * numerador) + denominador / f.denominador * f.numerador;
    }

    public void somar(int f) {
        this.numerador = numerador * f;
    }

    public void subtrair(Fracao f) {
        int denominadorAnterior = denominador;
        this.denominador = denominador * f.denominador;
        this.numerador = (denominador / denominadorAnterior * numerador) - denominador / f.denominador * f.numerador;

    }

    public void subtrair(int f) {
        this.numerador = numerador - denominador * f;

    }

    public void multiplicar(Fracao f) {
        this.numerador = numerador * f.numerador;
        this.denominador = denominador * f.denominador;

    }
    public void multiplicar(int f) {
        this.numerador = numerador * f;

    }

    public void dividir(Fracao f) {
        this.numerador = numerador * f.denominador;
        this.denominador = denominador * f.numerador;
    }

    public void dividir(int f) {
        this.denominador = denominador * f;

    }


}
