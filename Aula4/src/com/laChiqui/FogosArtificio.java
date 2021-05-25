package com.laChiqui;

public class FogosArtificio implements Explosivos {
    private String barulho;

    public FogosArtificio(String barulho) {
        this.barulho = barulho;
    }

    @Override
    public void explodir() {
        System.out.println(barulho);
    }
}
