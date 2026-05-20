package aula04;

public class Lista {
    //atributos
    private No inicio;
    private No fim;

    //construtor
    public Lista(){
        inicio = null;
        fim = null;
    }
    private boolean vazio(){
        return (inicio == null || fim == null);
    }
    public void inserirIni(int info){
        No novo = new No(info); 

        if(vazio()){ //lista vazia
            this.inicio = novo;
            this.fim = novo;
        }else{ //lista nao esta vazia
            novo.setProx(inicio);
            inicio = novo;
        }
    }
    public void listar(){
        No atual = inicio;
        if (vazio()) {
            System.out.println(" --> Lista vazia <--");
        }else{
            while(atual != null) {
                System.out.println(atual.getInfo());
                atual = atual.getProx();
            }
        }
    }
}
