package teste;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio1 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Lucas",21L,"RM78123");
        Aluno aluno2 = new Aluno("José",25L,"RM78323");

        Disciplina disciplina = new Disciplina("Matematica",100L);
        Disciplina disciplina2 = new Disciplina("Historia",100L);

        Turma turma = new Turma("1o Medio", 'C', Collections.singletonList(aluno),Collections.singletonList(disciplina));
        Turma turma2 = new Turma("2o Medio", 'B', Collections.singletonList(aluno2),Collections.singletonList(disciplina2));


        System.out.println(turma2);
        System.out.println(turma);


    }
}
