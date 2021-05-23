package com.company.Manha;

import java.util.Scanner;

public class Exercicio3 {
    //verifica se eh primo

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

        if(ePrimo(num) == true && num>1){
            System.out.println(num + " eh um numero primo");
        } else {
            System.out.println("Nao eh numero primo");
        }
    }
}
