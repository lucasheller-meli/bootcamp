package Manha.SaveTheRopa;

import java.util.Arrays;

public class RunGuardaRoupa {

    public static void main(String[] args){
        final GuardaRoupa guardaRoupa = new GuardaRoupa();

        guardaRoupa.guardarVestuario(Arrays.asList(new Vestuario("marca 1", "modelo 1"), new Vestuario("marca 2", "modelo 2")));
        guardaRoupa.listarVestuario();
        //guardaRoupa.removerVestuario(1);


    }
}
