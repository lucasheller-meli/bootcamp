package Manha.Exercicio.Exercicio4;

public class RunNumerador {

    public static void main(String[] args){

        Fracao f1 = new Fracao(1,2);
        Fracao f2 = new Fracao(2, 1);

        f1.multiplicar(f2);
        System.out.println(f1.getNumerador());



    }

}
