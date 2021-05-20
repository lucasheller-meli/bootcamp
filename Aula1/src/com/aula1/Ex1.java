package com.aula1;

// Desenvolva um programa para mostrar os primeiros n números pares,
// sendo n um valor que o usuário irá inserir pelo console.
// Lembre-se que um número é par quando divisível por 2.

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maximumNumber = input.nextInt();

        IntStream.rangeClosed(0, maximumNumber).forEach((number) -> {
            if (number % 2 == 0) System.out.println(number);
        });
    }
}
