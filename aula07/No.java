package aula07;

public class No {
    //atributos
    private Aluno info;
    private No prox;
    //construtor
    public No(Aluno info) {
        this.info = info;
        this.prox = null;
    }
     public Aluno getInfo() {
         return info;
     }
     public void setInfo(Aluno info) {
         this.info = info;
     }
     public No getProx() {
         return prox;
     }
     public void setProx(No prox) {
         this.prox = prox;
     }
    

    

}
