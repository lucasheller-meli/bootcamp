package Manha.Exercicio.Exercicio1;

public class ContaCorrente {
    private double conta;
    private double saldo;

    public ContaCorrente(double conta, double saldo){
        this.conta = conta;
        this.saldo = saldo;
    }

    public ContaCorrente(){}

    public double getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor){
        this.saldo = this.saldo + valor;
    }

    public void saque(double valor){
        this.saldo = this.saldo - valor;
    }

    public void transferencia(ContaCorrente conta, double valor){
        conta.deposito(valor);
        this.saldo = this.saldo - valor;
    }

    public void copia(ContaCorrente conta){
        this.conta = conta.getConta();
        this.saldo = conta.getSaldo();
    }

}
