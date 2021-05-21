package teste;

public class Aluno {
    private String nome;
    private Long idade;
    private String registro;

    public Aluno() {
    }

    public Aluno(String nome, Long idade, String registro) {
        this.nome = nome;
        this.idade = idade;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", registro='" + registro + '\'' +
                '}';
    }
}
