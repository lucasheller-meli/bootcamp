package aula2;

public class CurrentAccount {

    private double value;

    private String numberAccount;

    private String cpf;

    public CurrentAccount(CurrentAccount contaCopiada) {
        this.value = contaCopiada.getValue();
        this.numberAccount = contaCopiada.getNumberAccount();
        this.cpf = contaCopiada.getCpf();
    }

    public CurrentAccount(double value, String numberAccount, String cpf) {
        this.value = value;
        this.numberAccount = numberAccount;
        this.cpf = cpf;
    }

    public void deposit(double value) {
        this.value += value;
    }

    public boolean withdraw(double value) {
        if(value > this.value) {
            System.out.println("Saldo insuficiente.");
            return false;
        } else {
            this.value -= value;
            return true;
        }
    }

    public void transfer(CurrentAccount account, double value) {
        if(withdraw(value)) {
            account.deposit(value);
        } else {
            System.out.println("Trasnferência cancelada.");
        }
    }

    public void giveBack(CurrentAccount account, double value) {
        if (account.withdraw(value)) {
            this.deposit(value);
        } else {
            System.out.println("Devolução do dinheiro cancelada.");
        }
    }

    public double getValue() {
        return value;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public String getCpf() {
        return cpf;
    }

    // não criei setters, ia ferir o encapsulamento
}
