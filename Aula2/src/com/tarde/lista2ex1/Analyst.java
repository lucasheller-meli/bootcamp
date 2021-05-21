package com.tarde.lista2ex1;

public class Analyst extends CLTEmployee {

    int achieviments;

    Analyst(double baseSalary) {
        this.baseSalary = 4000.0;
    }

    @Override
    public double pay() {
        double monthlyBonus = baseSalary*achieviments*0.08;
        achieviments = 0;
        return baseSalary + monthlyBonus;
    }

    public void addAchieviment() {
        achieviments += 1;
    }

}
