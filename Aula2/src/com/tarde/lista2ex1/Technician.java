package com.tarde.lista2ex1;

public class Technician extends CLTEmployee{

    int achieviments;

    Technician() {
        this.baseSalary = 3200.0;
    }

    @Override
    public double pay() {
        double monthlyBonus = baseSalary*achieviments*0.05;
        achieviments = 0;
        return baseSalary + monthlyBonus;
    }

    public void addAchieviment() {
        achieviments += 1;
    }

}
