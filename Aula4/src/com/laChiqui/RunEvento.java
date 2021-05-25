package com.laChiqui;

import java.util.List;

public class RunEvento {
    public static void main(String[] args) {
        FogosArtificio f1 = new FogosArtificio("Buum1");
        FogosArtificio f2 = new FogosArtificio("Buum2");
        FogosArtificio f3 = new FogosArtificio("Buum3");
        FogosArtificio f4 = new FogosArtificio("Buum4");

        PacoteFogos p1 = new PacoteFogos(List.of(f1, f2, f3));
        PacoteFogos p2 = new PacoteFogos(List.of(f4, p1));

        Convidados c1 = new ConvidadoMeli("Mari");
        Convidados c2 = new ConvidadoMeli("Thami");
        Convidados c3 = new ConvidadoMeli("Rodrigo");
        Convidados c4 = new ConvidadoStandart("Lucas");
        Convidados c5 = new ConvidadoStandart("Gabriel");

        Evento evento = new Evento(List.of(p1,p2),List.of(c1, c2, c3, c4, c5));
        evento.apagarVelas();

    }
}
