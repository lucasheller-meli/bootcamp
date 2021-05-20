package com.aula1;

// Exercício 1: Dado um vetor de 10 posições, sendo respectivamente ocupado pelos valores 52, 10, 85, 1324, 01, 13, 62, 30, 12 e 127.
// Imprima no console:
// a) Sua ordenação crescente.
// b) Sua ordenação decrescente.

import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {

        Integer[] array = { 52, 10, 85, 1324, 1, 13, 62, 30, 12, 127 };

        Arrays.sort(array);

        for(int number : array) {
            System.out.println(number);
        }

        System.out.println("Decrescente");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
