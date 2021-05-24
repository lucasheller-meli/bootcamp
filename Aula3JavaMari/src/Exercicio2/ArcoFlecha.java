package Exercicio2;

public class ArcoFlecha implements Arma{
    @Override
    public int usar() {
        return 20;
    }

    @Override
    public String funcionalidade() {
        return "Atirou uma flecha.";
    }
}
