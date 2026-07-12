public class Lista{
    //atributos
    private No inicio;
    private No fim;
    private int total;

    //construtor
    public Lista(){
        this.inicio = null;
        this.fim = null;
        this.total = 0;
    }

    private boolean isVazia(){
        return (inicio == null || fim == null);
    }

    //inserir no inicio da Lista
    public void inserirIni(String info){
        No novo = new No(info); //criar o novo No
        if(isVazia()){ //lista vazia
            inicio = novo;
            fim = novo;
        }else{ //lista nao vazia
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }
        total++; //total aumenta pois ja temos mais um elemento na lista
    }
    //inserir o novo elemento no final da lista
    public void inserirFim(String info){
        No novo = new No(info); //criar o novo No
        if(isVazia()){ //lista vazia
            inicio = novo;
            fim = novo;
        }else{ //lista nao vazia
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
        }
        total++; //total aumenta pois ja temos mais um elemento na lista
    }
    public void inserirPos(int i, String info){
        if(i < 0 || i > total){
        System.out.println("Posição inválida!");
        return;
             }

    if(i == 0){
        inserirIni(info);
        return;
    }
        if(i == total){
        inserirFim(info);
        return;
             }

    No novo = new No(info);
    No atual = inicio;

    for(int j = 0; j < i; j++){
        atual = atual.getProx();
    }

    novo.setProx(atual);
    novo.setAnt(atual.getAnt());

    atual.getAnt().setProx(novo);
    atual.setAnt(novo);

    total++;
}
    
    //metodo para listar todos os elementos numa Lista
    public void listar(){
       No atual = inicio;
       if(isVazia()){
        System.out.println("A lista esta vazia");
       }else{
            while (atual != null) {
                System.out.println(atual.getInfo());
                atual = atual.getProx();
            }
       }
    }
    public void pesquisar(String info){
       

    int pos = encontrou(info);

    if(pos == -1){
        System.out.println("Elemento não encontrado.");
    }else{
        System.out.println("Elemento encontrado na posição " + pos);
         }   
    }
    private boolean existe(String info){

    No atual = inicio;

    while(atual != null){

        if(atual.getInfo().equals(info)){
            return true;
        }

        atual = atual.getProx();
       }

    return false;
    }

    //Metodo encontrar
    private int encontrou(String info){
     

    No atual = inicio;
    int pos = 0;

    while(atual != null){

        if(atual.getInfo().equals(info)){
            return pos;
        }

        atual = atual.getProx();
        pos++;
    }

        return -1;
    }
    //Metodo remover
    public void removerIni(){

    if(isVazia()){
        System.out.println("Lista vazia.");
        return;
    }

    if(inicio == fim){
        inicio = null;
        fim = null;
    }else{
        inicio = inicio.getProx();
        inicio.setAnt(null);
    }

    total--;
    }
    //Metodo remover
    public void removerFim(){

    if(isVazia()){
        System.out.println("Lista vazia.");
        return;
    }

    if(inicio == fim){
        inicio = null;
        fim = null;
    }else{
        fim = fim.getAnt();
        fim.setProx(null);
    }

    total--;
    }
    //Metodo removerpos
    public void removerPos(int i){

    if(i < 0 || i >= total){
        System.out.println("Posição inválida.");
        return;
    }

    if(i == 0){
        removerIni();
        return;
    }

    if(i == total - 1){
        removerFim();
        return;
    }

    No atual = inicio;

    for(int j = 0; j < i; j++){
        atual = atual.getProx();
    }

    atual.getAnt().setProx(atual.getProx());
    atual.getProx().setAnt(atual.getAnt());

    total--;
    }
    //Metodo Remover
    public void remover(String info){

    int pos = encontrou(info);

    if(pos == -1){
        System.out.println("Elemento não encontrado.");
        return;
    }

    removerPos(pos);
}

}
