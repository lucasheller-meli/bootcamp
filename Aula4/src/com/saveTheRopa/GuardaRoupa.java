package com.saveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {

    private Map<Integer, List<Vestuario>> vestuarios = new HashMap<>();
    private Integer counter = 0;

    public GuardaRoupa() {
    }

    public Map<Integer, List<Vestuario>> getVestuarios() {
        return vestuarios;
    }

    public void setVestuarios(Map<Integer, List<Vestuario>> vestuarios) {
        this.vestuarios = vestuarios;
    }

    public Integer getCounter() {
        return counter;
    }

    private Integer adicionaCounter() {
        return this.counter++;
    }

    public Integer guardarRoupas(List<Vestuario> vestuarios){
        var valorContador = adicionaCounter();
        this.vestuarios.put(valorContador,vestuarios);
        return valorContador;
    }

    public void listarVestuarios(){
        this.vestuarios.forEach((key, value) -> System.out.println("Chave -> " + key + " " + value + " \n"));
    }

    public void listaUmVestuario(Integer key){
        System.out.println(this.vestuarios.get(key));
    }

    public void removerVestuario(Integer key){
        System.out.println("Removendo vestuario -> "+this.vestuarios.remove(key));
    }


}
