package Manha.Exercicio.Exercicio3;

public class Biblioteca {

    public static void main(String[] args){

        Book book1 = new Book("Harry Potter", 1234567, "J. K. Rowling");

        book1.emprestimo();
        book1.devolver();

        if(book1.getStatus() == 1){
            System.out.println(book1.toString());
            System.out.println("O livro emprestado");
        }else{
            System.out.println("Livro disponivel");
        }

    }
}
