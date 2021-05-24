package Exercicio2;

public class RunJogo {

    public static void main(String[] args){
        Personagem personagem = new Personagem("Joao", Classe.ARQUEIRO, 1, 12,new ArcoFlecha());
        System.out.println(personagem.getArma().funcionalidade());
        personagem.setArma(new Cajado());
        System.out.println(personagem.getArma().funcionalidade());

    }
}
