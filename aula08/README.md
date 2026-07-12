# CAA | Exercício(s) Prático(s) (OEA)
O professor da disciplina *CAA* pediu aos seus alunos que o auxiliassem na conceção de um programa em **JAVA**. O programa deve permitir representar cada aluno. O **Aluno** é identificado pelo seu **id**, **nome**, **telefone** e **nota** que obteve.
Pretende-se, usando *Lista Duplamente Ligada*:
1) Implementar o programa, criando uma **Pilha** 
2) Implementar o programa, criando uma **Fila**

NOTA:
- **Pilha**: push(info), pop, limpar
- **Fila**: inserir(info), remover,retirar

  package Exercicio1
  public class Aluno {

    private int id;
    private String nome;
    private String telefone;
    private double nota;

    public Aluno(int id, String nome, String telefone, double nota) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return id + " - " + nome + " - " + telefone + " - Nota: " + nota;
    }

}
// classe No
public class No {

    private Aluno info;
    private No ant;
    private No prox;

    public No(Aluno info) {
        this.info = info;
    }

    public Aluno getInfo() {
        return info;
    }

    public void setInfo(Aluno info) {
        this.info = info;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

}
//classe lista 
public class Lista {

    private No inicio;
    private No fim;
    private int total;

    public Lista() {
        inicio = null;
        fim = null;
        total = 0;
    }

    public boolean isVazia() {
        return inicio == null;
    }

    public void inserirInicio(Aluno a) {

        No novo = new No(a);

        if (isVazia()) {
            inicio = fim = novo;
        } else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }

        total++;
    }

    public void inserirFim(Aluno a) {

        No novo = new No(a);

        if (isVazia()) {
            inicio = fim = novo;
        } else {
            fim.setProx(novo);
            novo.setAnt(fim);
            fim = novo;
        }

        total++;
    }

    public Aluno removerInicio() {

        if (isVazia())
            return null;

        Aluno a = inicio.getInfo();

        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.getProx();
            inicio.setAnt(null);
        }

        total--;

        return a;
    }

    public Aluno removerFim() {

        if (isVazia())
            return null;

        Aluno a = fim.getInfo();

        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.getAnt();
            fim.setProx(null);
        }

        total--;

        return a;
    }

    public void listar() {

        No aux = inicio;

        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }

}
