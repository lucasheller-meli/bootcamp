package com.aula1;

// Desenvolver um programa para exibição por console os n primeiros números naturais que têm pelo menos de m dígitos de d,
// sendo n, m e d valores que o utilizador vai entrar pela consola.

// Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3,
// o programa deve exibir os primeiros 5 números naturais que tenham pelo menos 2 dígitos 3 no console.
// Neste caso, a saída será: 33, 133 , 233, 303, 313.

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantityToShow = input.nextInt();
        int minimumDigits = input.nextInt();
        char digitToHave = Character.forDigit(input.nextInt(), 10);

        IntStream.rangeClosed(0, Integer.MAX_VALUE)
                .filter(number -> String.valueOf(number).chars().filter(digit -> ((char) digit) == digitToHave).count() >= minimumDigits)
                .limit(quantityToShow)
                .forEach(System.out::println);
    }
}
