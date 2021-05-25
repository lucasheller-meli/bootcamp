package Manha.Dakar;

public class SocorristaCarro implements Socorrista <Carros>{
    //implementa a interface para o veiculo Carro
    @Override
    public void socorrer(Carros carros) {
        System.out.println("Socorrendo carro com a placa: " + carros.getPlaca());
    }
}
