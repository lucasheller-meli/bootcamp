package com.aula1;

//Para um protótipo de supermercado, crie um programa que leia 3 produtos e imprima no console: nome, preço, quantidade e o valor total da compra.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            String name = input.next();
            double price = input.nextDouble();
            int quantity = input.nextInt();

            products.add(new Product(name, price, quantity, i));
        }

        products.forEach(Product::print);

        double total = products.stream().reduce(0.0, (accumulator, current) ->  accumulator + current.getTotalPrice(), Double::sum);

        System.out.println("Valor total: R$" + total);
    }
}

class Product {
    private final String name;
    private final double price;
    private final int quantity;
    private final int index;

    public Product(String name, double price, int quantity, int index) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.index = index;
    }

    public void print() {
        System.out.println("Produto " + this.index);
        System.out.println(this.name);
        System.out.println("R$" + this.price);
        System.out.println("Quantidade: " + this.quantity);
        System.out.println("");
    }


    public double getTotalPrice() {
        return this.price * this.quantity;
    }
}
