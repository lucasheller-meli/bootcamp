import java.util.Scanner;

public class ThamirezExerc {
    public static boolean Par(int n){
        return n%2==0;
    }
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int numero = teclado.nextInt();


            for (int i = 0; i <= numero; i++){

                if(Par(i)){
                    System.out.println(i + " é um número par.");
            }
        }
    }
}
