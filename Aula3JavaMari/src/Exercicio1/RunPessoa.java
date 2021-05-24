package Exercicio1;

public class RunPessoa {

    public static void main(String[] args){

        Pessoa pessoa = new Pessoa("Ana", 123456);
        Pessoa pessoa1 = new Pessoa("Claudia", 45678);
        Pessoa pessoa2 = new Pessoa("Daniela", 45678);
        Pessoa pessoa3 = new Pessoa("Beatriz", 45678);

        Precedente<Pessoa>[] listapessoa = new Precedente[4];
        listapessoa[0] = pessoa;
        listapessoa[1] = pessoa1;
        listapessoa[2] = pessoa2;
        listapessoa[3] = pessoa3;


        Precedente<Pessoa>[] ordenado = SortUtil.sort(listapessoa);

        for(Precedente<Pessoa> pessoal : ordenado){
            System.out.println(pessoal.imprimir());
        }

        System.out.println(pessoa.precedeA(pessoa1));

    }

}
