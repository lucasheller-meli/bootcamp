package com.manha.lista2ex3;

public class Livraria {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setAutor("Joao");
        livro.setIsbn("123A");
        livro.setTitulo("Programando java");
        System.out.println(livro);
        livro.emprestimo();
        livro.devolver();
    }
}
