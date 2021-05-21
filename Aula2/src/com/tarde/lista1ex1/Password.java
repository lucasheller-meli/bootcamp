package com.tarde.lista1ex1;

import java.util.regex.Pattern;

public class Password {

    private String password;
    private String regex;

    public Password(String regex) {
        this.regex = regex;
    }

    public void setPassword(String password) throws Exception{
        if(Pattern.compile(this.regex).matcher(password).matches()){
            System.out.println("Funcionou");
            this.password = password;
        }else{
            System.out.println("Senha fraca");
            throw new Exception("Weak password");
        }
    }
}
