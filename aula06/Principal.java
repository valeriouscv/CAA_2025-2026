package aula06;

public class Principal{
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.inserir(1);
        fila.inserir(2);
        fila.inserir(3);
        fila.listar();
        int res = fila.retirar();
        System.out.println("retirei: "+res);
        fila.listar();
    }
}