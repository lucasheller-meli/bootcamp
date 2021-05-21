package com.tarde.lista1ex1;

public class TestPasswords {
    public static void main(String[] args){
        StrongPassword strongPassword = new StrongPassword();

        try {
            strongPassword.setPassword("Geeks@portal20");
            strongPassword.setPassword("asd");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
