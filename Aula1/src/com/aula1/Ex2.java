package com.aula1;

// Desenvolva um programa para mostrar os primeiros n números múltiplos de m,
// sendo n e m valores que o usuário irá inserir via console.
// Lembre-se que um número a é divisível por b se a é divisível por b.

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantityToShow = input.nextInt();
        int multiple = input.nextInt();

        IntStream.rangeClosed(multiple + 1, Integer.MAX_VALUE)
                .filter((number) -> isMultiple(number, multiple))
                .limit(quantityToShow).forEach(System.out::println);
    }

    private static boolean isMultiple(int base, int multiple) {
        if (multiple == 0) return true;
        return base % multiple == 0;
    }
}
