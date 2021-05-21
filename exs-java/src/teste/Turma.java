package teste;

import java.util.List;

public class Turma {

    private String serie;

    private char idSerie;

    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;

    public Turma(String serie, char idSerie, List<Aluno> alunos, List<Disciplina> disciplinas) {
        this.serie = serie;
        this.idSerie = idSerie;
        this.alunos = alunos;
        this.disciplinas = disciplinas;
    }

    public Turma() {
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public char getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(char idSerie) {
        this.idSerie = idSerie;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "serie='" + serie + '\'' +
                ", idSerie=" + idSerie +
                ", alunos=" + alunos +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
