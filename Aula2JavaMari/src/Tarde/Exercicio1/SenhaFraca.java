package Tarde.Exercicio1;

public class SenhaFraca extends Senha{
    public SenhaFraca() {
        super("^(?=.*[0-9])"
                + "(?=\\S+$).{8,20}$");
    }
}
