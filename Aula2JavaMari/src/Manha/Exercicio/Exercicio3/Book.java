package Manha.Exercicio.Exercicio3;

public class Book{
    private String titulo;
    private long isbn;
    private String autor;
    private int status;

    public Book(String titulo,long isbn, String autor){
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public int getStatus() {
        return status;
    }

    public void emprestimo(){
        this.status = 1;
    }

    public void devolver(){
        this.status = 0;
    }

    @Override
    public String toString() {
        return this.titulo + ", " + this.isbn + ", " + this.autor;
    }
}
