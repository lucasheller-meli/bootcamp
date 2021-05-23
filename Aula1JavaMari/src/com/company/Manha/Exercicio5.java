package com.company.Manha;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercicio5 {

    public static void main(String [] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o n:");
        int n = teclado.nextInt();
        System.out.println("Digite o m:");
        int m = teclado.nextInt();
        System.out.println("Digite o d:");
        int d = Character.forDigit(teclado.nextInt(), 10);

        IntStream.rangeClosed(0, Integer.MAX_VALUE)
                .filter(number -> String.valueOf(number).chars().filter(digit -> ((char) digit) == d).count() >= m)
                .limit(n)
                .forEach(System.out::println);

    }
}
