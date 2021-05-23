package Tarde;

import java.util.Date;

public class TesteArray {

    public static void main(String[] args){
        Object[] arr = new Object[3];
        arr[0] = "Ola";
        arr[1] = 2;
        arr[2] = new Date();

        mostrarArgs(arr);

    }

    public static void mostrarArgs(Object arr[]){
        for(int i =0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
