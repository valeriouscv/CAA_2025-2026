public class No{
    //atributos
    private String info;
    private No prox;
    private No ant;

    //construtor
    public No(String info){
        this.info = info;
        this.prox = null;
        this.ant = null;
    }
    //getters & setters
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public No getProx() {
        return prox;
    }
    public void setProx(No prox) {
        this.prox = prox;
    }
    public No getAnt() {
        return ant;
    }
    public void setAnt(No ant) {
        this.ant = ant;
    }
    
}