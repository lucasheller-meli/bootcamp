package src.com.manha.lista1ex1;

public class MainPessoa {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Ana", "123456");
        Pessoa pessoa1 = new Pessoa("Claudia", "45678");
        Pessoa pessoa2 = new Pessoa("Daniela", "45678");
        Pessoa pessoa3 = new Pessoa("Beatriz", "45678");

        Precedente<Pessoa>[] listaPessoa = new Precedente[4];
        listaPessoa[0] = pessoa;
        listaPessoa[1] = pessoa1;
        listaPessoa[2] = pessoa2;
        listaPessoa[3] = pessoa3;

        SortUtil.sort(listaPessoa);

        for (Precedente<Pessoa> p : listaPessoa) {
            System.out.println(p.imprimeAtributo());
        }
        //System.out.println(pessoa.precedeA(pessoa1));
    }

}

