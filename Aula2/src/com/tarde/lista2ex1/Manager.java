package com.tarde.lista2ex1;

public class Manager extends CLTEmployee{

    int achieviments;

    Manager() {
        this.baseSalary = 6000.0;
    }

    @Override
    public double pay() {
        double monthlyBonus = baseSalary*achieviments*0.125;
        achieviments = 0;
        return baseSalary + monthlyBonus;
    }

    public void addAchieviment() {
        achieviments += 1;
    }

}
