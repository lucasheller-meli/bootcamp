package Exercicio2;

public class Cajado implements Arma{
    @Override
    public int usar() {
        return 50;
    }

    @Override
    public String funcionalidade() {
        return "Jogou um cajado no outro.";
    }
}
