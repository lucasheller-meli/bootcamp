package com.aula1;

// Desenvolva um programa para mostrar por console os primeiros n números primos,
// sendo um valor que o usuário irá inserir pelo console.

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        IntStream.rangeClosed(2, Integer.MAX_VALUE).filter(Ex4::isPrime).limit(number).forEach(System.out::println);
    }

    private static boolean isPrime(int number) {
        if (number == 0 || number == 1) return false;

        long divisors = IntStream.rangeClosed(1, number).filter((divisor) -> isDivisor(number, divisor)).limit(3).count();

        return divisors <= 2;
    }

    private static boolean isDivisor(int base, int divisor) {
        if (divisor == 0) return false;

        return base % divisor == 0;
    }
}
