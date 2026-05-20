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
        //codigo
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
        //codigo
    }
    private boolean existe(String info){
        return false;
    }
    private int encontrou(String info){
        return -1;
    }
    public void removerIni(){
        //codigo
    }
    public void removerFim(){
        //codigo
    }
    public void removerPos(int i){
        //codigo
    }
    public void remover(String info){
        //codigo
    }
}