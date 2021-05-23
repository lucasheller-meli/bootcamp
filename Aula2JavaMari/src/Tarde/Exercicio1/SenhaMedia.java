package Tarde.Exercicio1;

import java.util.regex.Pattern;

public class SenhaMedia extends Senha{

    public SenhaMedia() {
        super("^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=\\S+$).{8,20}$");
    }

}
