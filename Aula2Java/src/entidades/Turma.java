package entidades;

import java.util.List;

public class Turma {
    private int serie;
    private int codigo;
    private List<Disciplina> disciplinas;
    private List<Estudante> estudante;

    public Turma(int serie, int codigo, List<Disciplina> disciplinas, List<Estudante> estudante){
        this.serie = serie;
        this.codigo = codigo;
        this.disciplinas = disciplinas;
        this.estudante = estudante;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Estudante> getEstudante() {
        return estudante;
    }

    public void setEstudante(List<Estudante> estudante) {
        this.estudante = estudante;
    }


}
