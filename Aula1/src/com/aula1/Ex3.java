package com.aula1;

// Desenvolva um programa para informar se um um número n é primo ou não,
// sendo n um valor que o usuário irá inserir pelo console.
// Lembre-se que um número é primo quando só é divisível por 1 e por si mesmo.
// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number == 0 || number == 1) {
            System.out.println(false);
            return;
        }

        long divisors = IntStream.rangeClosed(1, number).filter((divisor) -> isDivisor(number, divisor)).limit(3).count();

        System.out.println(divisors <= 2);
    }

    private static boolean isDivisor(int base, int divisor) {
        if (divisor == 0) return false;
        return base % divisor == 0;
    }
}
