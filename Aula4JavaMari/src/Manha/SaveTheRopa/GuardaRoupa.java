package Manha.SaveTheRopa;

import Manha.SaveTheRopa.Vestuario;

import java.util.*;

public class GuardaRoupa {

    private Map<Integer, List<Vestuario>> vestuario = new HashMap<>();
    private Integer counter = 0;

    public GuardaRoupa(){
    }

    public Map<Integer, List<Vestuario>> getVestuario() {
        return vestuario;
    }

    public void setVestuario(Map<Integer, List<Vestuario>> vestuario) {
        this.vestuario = vestuario;
    }

    public Integer getCounter() {
        return counter;
    }

    private Integer increaseCounter() {
        return this.counter++;
    }

    public Integer guardarVestuario(List<Vestuario> vestuarios){
        //Recebe a lista de roupas e aloca no map e retorna a posicao do map que ela ta
        var counterValue = increaseCounter();
        this.vestuario.put(counterValue, vestuarios);
        return counterValue;
    }

    public void listarVestuario(){
        //lista todas as roupas que estao armazenada e onde estao
        this.vestuario.forEach((key, value) -> System.out.println("Chave -> " + key + " " + value + "\n"));
    }

    public void listarumVestuario(Integer key){
        System.out.println(this.vestuario.get(key));
    }

    public void removerVestuario(Integer key){
        System.out.println("Removendo o vestuario -> " + this.vestuario.remove(key));
    }


}
