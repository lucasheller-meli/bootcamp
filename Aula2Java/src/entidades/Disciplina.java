package entidades;

public class Disciplina {
    private String nome;
    private long cargahoraria;

    public Disciplina(String nome, long cargahoraria){
        this.nome = nome;
        this.cargahoraria = cargahoraria;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public String toString(){
        return "Disciplina " + nome + " Carga horario " + cargahoraria;
    }
}
