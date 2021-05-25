package Manha.Dakar;

public class RunDakar {

    public static void main(String[] args){

        Corrida corrida = new Corrida();
        corrida.setQuantidadedeVeiculosPermitidos(10);
        corrida.setDistancia(20.0);
        corrida.setNome("Corrida maluca");
        corrida.setPremioemDolares(1000.0);
        corrida.registrarCarro(100.0, 100.0,100.0, "ABC - 123456");
        corrida.registrarMoto(100.0, 100.0, 100.0, "DCF - 1234567");
        corrida.verificarVencedor();

        corrida.socorrer("ABC - 123456");
        corrida.socorrer("DCF - 1234567");
        corrida.socorrer("dfgs");


    }

}
