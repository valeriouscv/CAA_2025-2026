package aula09;
public class Arvore {
    //atributo
    private NoArvore raiz;
    //construtor
    public Arvore(){
        this.raiz = null;
    }
    //metodos
    public void inserir(int info){
        raiz = inserir(raiz, info);
    }
    private NoArvore inserir(NoArvore no, int info){
        if(no == null) return new NoArvore(info);
        if(info < no.getInfo()){
            no.setEsq(inserir(no.getEsq(), info));
        }else{
            no.setDir(inserir(no.getDir(), info));
        }
        return no;
    }
    private void visita(NoArvore no){
        if(no!=null){
            System.out.print(no.getInfo() + " ");
        }
    }
    public void preOrdem(){
        System.out.println("--> Pre-Ordem <--");
        preOrdem(raiz);
    }
    private void preOrdem(NoArvore no){
        if(no!=null){
            visita(no); //raiz de cada no
            preOrdem(no.getEsq());
            preOrdem(no.getDir());
        }
    }
    public void posOrdem(){
        System.out.println("--> Pos-Ordem <--");
        posOrdem(raiz);
    }
    private void posOrdem(NoArvore no){
        if(no!=null){
            posOrdem(no.getEsq());
            posOrdem(no.getDir());
            visita(no); //raiz de cada no
        }
    }
    public void emOrdem(){ //simetrica
        System.out.println("--> Em-Ordem / Simetrica <--");
        emOrdem(raiz);
    }
    private void emOrdem(NoArvore no){
        if(no!=null){
            emOrdem(no.getEsq());
            visita(no); //raiz de cada no
            emOrdem(no.getDir());
        }
    }
    public void porNivel(){
        //codigo
    }
    private void porNivel(NoArvore no){ //emOrdem
        //codigo
    }
    public void pesquisar(int info){
        //codigo
    }
    private boolean pesquisar(NoArvore no, int info){
        //codigo
        return false;
    }

}
