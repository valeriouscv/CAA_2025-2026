package aula06;

public class Fila{
    //atributos
    private No inicio;
    private No fim;

    //construtor
    public Fila(){
        inicio = null;
        fim = null;
    }
    private boolean vazio(){
        return (inicio == null || fim == null);
    }
    public void inserir(int info){
        No novo = new No(info); 

        if(vazio()){ //lista vazia
            this.inicio = novo;
            this.fim = novo;
        }else{ //lista nao esta vazia
            fim.setProx(novo);
            fim = novo;
        }
    }
    public int retirar(){
        int info; 
        if (vazio()) {
            System.out.println(" --> Fila vazia <--");
            return -1; // a fila esta vazia
        }
        info = inicio.getInfo();
        inicio = inicio.getProx();
        return info; //devolver o elemento no inicio da fila
    }
    public void remover(){
        int info; 
        if (vazio()) {
            System.out.println(" --> Fila vazia <--");
            return; // a fila esta vazia
        }
        inicio = inicio.getProx();
    }
    public void listar(){
        No atual = inicio;
        if (vazio()) {
            System.out.println(" --> Fila vazia <--");
        }else{
            while(atual != null) {
                System.out.println(atual.getInfo());
                atual = atual.getProx();
            }
        }
    }

}