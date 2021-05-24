package Exercicio1;

public class RunCelular {

    public static void main(String[] args){

        Precedente<Celular>[] listacelular = new Precedente[2];

        Celular celular = new Celular(123456, "Dani");
        Celular celular1 = new Celular(123456, "Bia");

        listacelular[0] = celular;
        listacelular[1] = celular1;

        Precedente<Celular>[] ordenado = SortUtil.sort(listacelular);

        for(Precedente<Celular> celulares : ordenado){
            System.out.println(celulares.imprimir());
        }

    }
}
