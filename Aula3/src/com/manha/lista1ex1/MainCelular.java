package src.com.manha.lista1ex1;

public class MainCelular {

    public static void main(String[] args) {
        Precedente<Celular>[] listacelular = new Precedente[2];

        Celular celular = new Celular(123456, "Dani");
        Celular celular1 = new Celular(123456, "Bia");

        listacelular[0] = celular;
        listacelular[1] = celular1;
        SortUtil.sort(listacelular);

        for (Precedente<Celular> celulares : listacelular) {
            System.out.println(celulares.imprimeAtributo());
        }

    }
}
