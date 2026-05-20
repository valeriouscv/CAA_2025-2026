package aula07;

public class Lista {
    private No inicio;
    private No fim;
    private int total;

    public Lista(){
        inicio = null;
        fim = null;
        total = 0;
    }
    private boolean isVazia(){
        return (inicio == null || fim == null);
    }
    public void inserirInicio(Aluno info){
        No novo = new No(info);
        if(isVazia()){ //lista vazia
            inicio = novo;
            fim = novo;
        }else{ //lista nao vazia
            novo.setProx(inicio);
            inicio = novo;
        }
        total++;
    }
    public void listar(){
        String nhaLista="";
        if (isVazia()) {
            System.out.println("--> Lista Vazia <--");
        }else{
            No atual = inicio;
            while (atual!=null) {
                nhaLista+=atual.getInfo().getNome();
                nhaLista+="->";
                atual = atual.getProx();
            }
            nhaLista+="null";
            System.out.println(nhaLista);
        }
    }
    public void removerInicio() {
       
        if (inicio == null){
            System.out.println("Lista vazia");
            return;
        }
        
        inicio = inicio.getProx();
       total--;

    }
}
