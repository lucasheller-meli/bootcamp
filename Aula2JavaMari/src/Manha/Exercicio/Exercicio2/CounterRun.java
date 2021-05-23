package Manha.Exercicio.Exercicio2;

import Manha.Exercicio.Exercicio2.Counter;

public class CounterRun {

    public static void main(String[] args){
        Counter counter = new Counter();

        counter.setNum(20);
        int soma = counter.adicao(2);

        System.out.println(counter.getNum());
        System.out.println(soma);

    }
}
