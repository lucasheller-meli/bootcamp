package com.laChiqui;

import java.util.ArrayList;
import java.util.List;

public class PacoteFogos implements Explosivos{

    private List<Explosivos> pacote;

    public PacoteFogos(List<Explosivos> pacote) {
        this.pacote = pacote;
    }

    @Override
    public void explodir() {
        pacote.forEach(f -> f.explodir());
    }
}
