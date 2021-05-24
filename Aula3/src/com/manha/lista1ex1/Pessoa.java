package src.com.manha.lista1ex1;

public class Pessoa implements Precedente<Pessoa>{

    private String nome;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    @Override
    public int precedeA(Pessoa pessoa) {
        return pessoa.nome.compareTo(this.nome) > 0 ? 1:0;
    }

    @Override
    public String imprimeAtributo() {
        return this.nome;
    }
}
