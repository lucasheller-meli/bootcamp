package Exercicio2;

public class Espada implements Arma{

    @Override
    public int usar() {
        //retorna a potencia da arma no outro
        return 32;
    }

    @Override
    public String funcionalidade() {
        return "Deu um golpe de espada";
    }

}
