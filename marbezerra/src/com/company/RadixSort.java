package com.company;

import java.util.*;

public class RadixSort {
    public static void radixSort(int iArr[]) {
        int maior = 0;
        for(int i : iArr) {
            if(i > maior) {
                maior = i;
            }
        }
        int length = Integer.toString(maior).length();

        int tamanhoVetorNovo = iArr.length;
        String sArr[] = new String[iArr.length];
        for(int i : iArr) {
            int tam = Integer.toString(i).length();
            String s = "";
            for(int x=0; x<length - tam; x++) {
                s.concat("0");
            }
            s.concat(Integer.toString(i));
        }

        ArrayList<String> L0 = new ArrayList<>();
        ArrayList<String> L1 = new ArrayList<>();
        ArrayList<String> L2 = new ArrayList<>();
        ArrayList<String> L3 = new ArrayList<>();
        ArrayList<String> L4 = new ArrayList<>();
        ArrayList<String> L5 = new ArrayList<>();
        ArrayList<String> L6 = new ArrayList<>();
        ArrayList<String> L7 = new ArrayList<>();
        ArrayList<String> L8 = new ArrayList<>();
        ArrayList<String> L9 = new ArrayList<>();

        for(String s : sArr) {
            char x = s.charAt(s.length() - 1);
            if('0' == x) {
                L0.add(s);
            } else if('1' == x) {
                L1.add(s);
            } else if ('2' == x) {
                L2.add(s);
            } else if ('3' == x) {
                L3.add(s);
            } else if ('4' == x) {
                L4.add(s);
            } else if ('5' == x) {
                L5.add(s);
            } else if ('6' == x) {
                L6.add(s);
            } else if ('7' == x) {
                L7.add(s);
            } else if ('8' == x) {
                L8.add(s);
            } else if ('9' == x) {
                L9.add(s);
            }
        }

        for(int i = 0; i<9;i++){
            for(int j = 0; j < )
        }


        for(String s : sArr) {
            char x = s.charAt(s.length() - 2);
            if('0' == x) {
                L0.add(s);
            } else if('1' == x) {
                L1.add(s);
            } else if ('2' == x) {
                L2.add(s);
            } else if ('3' == x) {
                L3.add(s);
            } else if ('4' == x) {
                L4.add(s);
            } else if ('5' == x) {
                L5.add(s);
            } else if ('6' == x) {
                L6.add(s);
            } else if ('7' == x) {
                L7.add(s);
            } else if ('8' == x) {
                L8.add(s);
            } else if ('9' == x) {
                L9.add(s);
            }
        }

    }


public static void main(String[] args) {

    int iArr[] = {16223,898,13,906,235,23,9,1532,6388,2511,8};

    radixSort(iArr);
    for(int i : iArr) {
        System.out.println(i + " ");
    }

    }
}

