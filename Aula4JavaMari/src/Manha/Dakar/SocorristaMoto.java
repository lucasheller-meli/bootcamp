package Manha.Dakar;

public class SocorristaMoto implements Socorrista<Motos>{
    //implementa a interface para o veiculo Moto
    @Override
    public void socorrer(Motos motos) {
        System.out.println("Socorrendo a moto com placa: " + motos.getPlaca());
    }
}
