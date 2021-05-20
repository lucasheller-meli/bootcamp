package com.aula1;

// Em 2021 uma startup de tecnologia, denominada de “Empresa X” é avaliada em 1,13 milhão e possui uma média de crescimento anual de 148%,
// uma concorrente do ramo, “Empresa Y”, é avaliada em 18,4 milhões e com sua média de crescimento anual em 32%.

// Considerando este cenário, imprima no console (conforme formatação acima) a evolução anual até que a empresa X ultrapasse a empresa Y em seu valor de empresa.

public class Ex7 {
    public static void main(String[] args) {
        Company x = new Company("Empresa X", 1.13, 1.48);
        Company y = new Company("Empresa Y", 18.4, 0.32);

        int currentYear = 2021;

        while (x.getValue() < y.getValue()) {
            x.reportValue(currentYear);
            y.reportValue(currentYear);

            currentYear += 1;

            x.applyGrowth();
            y.applyGrowth();
        }

        x.reportValue(currentYear);
        y.reportValue(currentYear);
    }
}

class Company {
    private final String name;
    private double value;
    private final double growth;

    public Company(String name, double value, double growth) {
        this.name = name;
        this.value = value;
        this.growth = growth;
    }

    public void reportValue(int year) {
        System.out.println(this.name + " - 01/01/" + year + " - Valor da empresa: " + String.format("%.2f", this.value) + "m");
    }

    public void applyGrowth() {
        this.value *= 1 + this.growth;
    }

    public double getValue() {
        return value;
    }
}
