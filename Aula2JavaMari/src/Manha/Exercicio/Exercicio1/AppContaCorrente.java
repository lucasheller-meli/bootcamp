package Manha.Exercicio.Exercicio1;

public class AppContaCorrente {

    public static void main(String[] args){

       ContaCorrente conta1 = new ContaCorrente(1234, 1000);
       ContaCorrente conta2 = new ContaCorrente(5678, 1000);

       conta1.deposito(200);
       conta1.saque(100);
       conta1.transferencia(conta2, 100);
       System.out.println(conta1.getSaldo());
       System.out.println(conta2.getSaldo());

    }

}
