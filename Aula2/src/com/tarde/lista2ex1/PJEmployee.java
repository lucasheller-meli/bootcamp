package com.tarde.lista2ex1;

// Funcionários PJ são prestadores de serviços e recebem por hora trabalhada.

public class PJEmployee implements Employee {
    double workedHours;

    double value;

    @Override
    public double pay() {
        double salary = value*workedHours;
        workedHours = 0.0;
        return salary;
    }

    public void addHoursOfTheDay(double workedHours){
        this.workedHours += workedHours;
    }


}
