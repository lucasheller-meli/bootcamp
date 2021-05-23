package Tarde.Exercicio3;

public abstract class FuncionarioCLT {

    double salario;

    public FuncionarioCLT(double salario){ this.salario = salario;}

    public abstract void pagarSalario(double meta);

}

class tecnicos extends FuncionarioCLT{

    public tecnicos() {
        super(3200);
    }

    @Override
    public void pagarSalario(double meta) {
        this.salario = this.salario + .5 * meta;

    }

}

