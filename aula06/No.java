package aula06;

public class No {
    //atributos
    private int info;
    private No prox;

    //construtor
    public No() {
        this.info = 0;
        this.prox = null;
    }
    public No(int info) {
        this.info = info;
        this.prox = null;
    }
    public No(int info, No prox) {
        this.info = info;
        this.prox = prox;
    }

    //getters & setters
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public No getProx() {
        return prox;
    }
    public void setProx(No prox) {
        this.prox = prox;
    }

    
    
}
