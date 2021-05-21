package company;

import java.util.*;

public class Exercicio1{

    public static boolean ePar(int n){
        return n%2==0;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int num = teclado.nextInt();

        for(int i = 0; i <= num; i++){
            if(ePar(i)){
                System.out.println(i + " Número par");
            }
        }

    }
}
