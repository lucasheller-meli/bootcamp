package com.company;

import java.util.Scanner;

public class Exercicio4 {

    public static boolean ePrimo(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false; // nao primo
            }
        }return true; // primo
    }

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = teclado.nextInt();

        for(int i = 2; i < num; i++){
            if(ePrimo(i)){
                System.out.println("O numero " + i + " é primo");
            }
        }

    }

}
