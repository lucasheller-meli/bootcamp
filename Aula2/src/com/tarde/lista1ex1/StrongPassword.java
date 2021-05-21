package com.tarde.lista1ex1;

public class StrongPassword extends Password{
    public StrongPassword() {
        super("^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$");
    }
}
