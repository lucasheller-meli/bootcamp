package com.saveTheRopa;

import java.util.Arrays;
import java.util.Collections;

public class RodarVestuarios {


    public static void main(String[] args) {
        final GuardaRoupa guardaRoupa = new GuardaRoupa();
        guardaRoupa.guardarRoupas(Arrays.asList(new Vestuario("marca1","modelo1"), new Vestuario("marca2","modelo2")));
        guardaRoupa.guardarRoupas(Arrays.asList(new Vestuario("marca3","modelo4"), new Vestuario("marca5","modelo6")));
        guardaRoupa.listaUmVestuario(1);
        guardaRoupa.listarVestuarios();
        guardaRoupa.removerVestuario(1);
        guardaRoupa.listaUmVestuario(1);
        guardaRoupa.listarVestuarios();
    }
}
