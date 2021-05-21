import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha {

    String senha;

    public Senha(String senha){
        this.senha = senha;
    }

    public void setValue(String pwd){


    }

    public static void main(String[] args){
        String senha = "abcd";

        if(senha.matches("[a-z]")){
            System.out.println("Mari");

        }
    }


    
}
