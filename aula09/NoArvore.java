package aula09;
public class NoArvore{
    //atributos
    private int info;
    private NoArvore esq;
    private NoArvore dir;

    //construtor
    public NoArvore(int info){
        setInfo(info);
        setEsq(esq);
        setDir(dir);
    }
    //getters & setters
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public NoArvore getEsq() {
        return esq;
    }
    public void setEsq(NoArvore esq) {
        this.esq = esq;
    }
    public NoArvore getDir() {
        return dir;
    }
    public void setDir(NoArvore dir) {
        this.dir = dir;
    }


    
}