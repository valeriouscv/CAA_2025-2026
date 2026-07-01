package aula09;
public class Principal{
    public static void main(String[] args) {
        Arvore av = new Arvore();
        //inserir: 18, 15, 17, 20, 16, 50, 3, 42, 19, 7
        av.inserir(18);
        av.inserir(15);
        av.inserir(17);
        av.inserir(20);
        av.inserir(16);
        av.inserir(50);
        av.inserir(3);
        av.inserir(42);
        av.inserir(19);
        av.inserir(7);  
        //travessias
        av.emOrdem();
        //av.preOrdem();
        //av.posOrdem();
        //av.porNivel();
        //av.pesquisar(3);
        
    }
}