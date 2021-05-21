import entidades.Disciplina;
import entidades.Estudante;
import entidades.Turma;

import java.util.Arrays;
import java.util.List;

public class Escola {
    public static void main(String[] args){

        Disciplina disciplina = new Disciplina("Java", 64);
        Estudante estudante = new Estudante("Marianne", 25, 1234, "9B");
        Turma turma = new Turma(9,2, List.of(disciplina), List.of(estudante));

        System.out.println(disciplina.toString());
        System.out.println(turma.getCodigo());
    }
}
