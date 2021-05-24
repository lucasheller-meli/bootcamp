package com.manha.lista1ex1;

public class MainCelular {

    public static void main(String[] args) {
        Precedente<Celular>[] listaCelular = new Precedente[2];

        Celular celular = new Celular(123456, "Dani");
        Celular celular1 = new Celular(123456, "Bia");

        listaCelular[0] = celular;
        listaCelular[1] = celular1;
        SortUtil.sort(listaCelular);

        for (Precedente<Celular> celulares : listaCelular) {
            System.out.println(celulares.imprimeAtributo());
        }

    }
}
