public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserirIni("ana");
        lista.inserirFim("carla");
        //lista.inserirPos(1,"bela");
        lista.inserirFim("david");
        lista.inserirFim("zinsky");
        lista.listar();
        //lista.pesquisar("bela");
        //lista.removerIni(); //ana
        //lista.removerFim(); //zinsky
        //lista.removerPos(1); //carla
        //lista.remover("david");
        //lista.listar(); //bela
    }
}
