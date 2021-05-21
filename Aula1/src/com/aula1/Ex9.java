package com.aula1;

import java.util.*;

public class Ex9 {
    public static void main(String[] args) {
        int[] array = { 170, 45, 75, 90, 802, 24, 2, 66 };

        radixSort(array);
        for (int number : array) System.out.println(number);
    }

    private static void radixSort(int[] array) {
        int max = maximum(array);

        for (int exp = 1; max / exp > 0; exp *= 10) countSort(array, exp);
    }

    private static void countSort(int[] array, int exp) {
        int length = array.length;
        int[] output = new int[length];

        int i;
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < length; i++) count[(array[i] / exp) % 10]++;

        for (i = 1; i < 10; i++) count[i] += count[i - 1];

        for (i = length - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        for (i = 0; i < length; i++) array[i] = output[i];
    }

    private static int maximum(int[] array) {
        int max = 0;

        for (int number: array) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }
}
