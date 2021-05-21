package company;

import java.util.Scanner;

public class Execircio2 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digita o numero n:");
        int n = teclado.nextInt();

        System.out.println("Digita o numero m:");
        int m = teclado.nextInt();

        for(int i = 0; i < n; i++){
            if(i%m==0){
                System.out.println(i + " é multiplo de " + m);
            }
        }
    }
}
