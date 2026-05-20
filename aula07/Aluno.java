package aula07;

public class Aluno {
    private int id;
    private String nome;
    private String telefone;
    private double nota;

     public Aluno() {
        this.id = 0;
        this.nome = "";
        this.telefone = "";
        this.nota = 0.0;
    }
    public Aluno(int id, String nome, String telefone, double nota) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.nota = nota;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "Aluno [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", nota=" + nota + "]";
    }
    
}
