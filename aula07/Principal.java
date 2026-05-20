package aula07;

public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserirInicio(new Aluno(123, "Ana", "9123456", 17.0));
        lista.inserirInicio(new Aluno(321, "Bela", "9876543", 10.0));
        lista.inserirInicio(new Aluno(231, "Carla", "9988776", 8.0));
        lista.listar();
    }
}
