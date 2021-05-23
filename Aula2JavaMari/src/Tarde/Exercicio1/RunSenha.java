package Tarde.Exercicio1;

public class RunSenha {

    public static void main(String[] args){
        SenhaForte senhaforte = new SenhaForte();
        SenhaMedia senhamedia = new SenhaMedia();
        SenhaFraca senhafraca = new SenhaFraca();

        try {
             senhamedia.validaSenha("1234Mari");
             senhafraca.validaSenha("012345678");
             senhaforte.validaSenha("Geeks@portal20");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
