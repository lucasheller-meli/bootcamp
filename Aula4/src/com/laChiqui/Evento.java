package com.laChiqui;

import java.util.List;

public class Evento {

    private List<Explosivos> fogos;
    private List<Convidados> convidados;

    public Evento(List<Explosivos> fogos, List<Convidados> convidados) {
        this.fogos = fogos;
        this.convidados = convidados;
    }

    public void apagarVelas(){

        fogos.forEach( f -> f.explodir());
        convidados.forEach(c -> c.comerBolo());

    }
}
