package com.tarde.lista2ex1;

public class Director extends CLTEmployee {

    double companyResult;

    public Director() {
        this.baseSalary = 15000.00;
    }

    @Override
    public double pay() {
        double profitShare = companyResult*0.03;
        companyResult = 0.0;
        return  profitShare + baseSalary;
    }

    public void setCompanyResult(double companyResult) {
        this.companyResult = companyResult;
    }
}
