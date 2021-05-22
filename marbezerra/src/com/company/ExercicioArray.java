package com.company;

import java.util.Arrays;

public class ExercicioArray {

    public static void main(String[] args){
        Integer[] array = {52, 10, 05, 1324, 01, 13, 62, 30, 12, 127};
        Integer[] newArray = new Integer[array.length];

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int j = 0;

        for(int i = array.length - 1; i >= 0; i--){
            newArray[j] = array[i];
            j++;
        }

        System.out.println(Arrays.toString(newArray));
    }
}
