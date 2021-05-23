package Tarde.Exercicio1;

import java.util.regex.Pattern;

public class Senha {

    private String senha;
    private String regex;

    public Senha(String regex){ this.regex = regex; }

    public void validaSenha(String senha) throws Exception{
        if(Pattern.compile(this.regex).matcher(senha).matches()){
            //Compila com o regex e tenta combinar com a entrada fornecida
            //System.out.println("Funcionou");
            this.senha = senha;

        }else {
            //System.out.println("Senha fraca");
            throw new Exception("Senha Fraca");
        }

    }



}
