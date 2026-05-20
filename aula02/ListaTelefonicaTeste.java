import java.util.Scanner;

public class ListaTelefonicaTeste {
    private static void pausa(){
        Scanner ler = new Scanner(System.in);
        ler.nextLine(); 
    }
    public static void menu(){
        System.out.println("\n\n\n");
        System.out.println("+-----------------------------+");
        System.out.println("| ---> Lista Telefonica  <--- |");
        System.out.println("+-----------------------------+");
        System.out.println("| 1 - inserir contacto        |");
        System.out.println("| 2 - pesquisar contacto      |");
        System.out.println("| 3 - listar todos contacto   |");
        System.out.println("| 4 - remover contacto        |");
        System.out.println("+-----------------------------+");
        System.out.println("| 0 -  sair                   |");
        System.out.println("+-----------------------------+");
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ListaTelefonica lista = new ListaTelefonica();
        int op;
        while(true) {
            menu();
            System.out.print("Escolha uma opcao: ");
            op = ler.nextInt();
            switch (op) {
                case 1: 
                    //pedir informações para criar um contacto telefonico
                    ler.nextLine(); //limpar o buffer do teclado
                    System.out.print("Nome: ");
                    String nome = ler.nextLine();
                    System.out.print("Indique o numero telefone: ");
                    int numTel = ler.nextInt();
                    ler.nextLine(); //limpar o buffer do teclado
                    System.out.print("Email: ");
                    String email = ler.nextLine();
                    //criar o contacto 
                    Contacto novoContacto = new Contacto(nome, numTel, email);
                    lista.inserirContacto(novoContacto);
                    pausa();
                    break;
                case 2: 
                    
                    ler.nextLine(); //limpar o buffer do teclado
                    System.out.print("Nome: ");
                    nome = ler.nextLine();
                    lista.pesquisar(nome);
                    pausa();
                    break;
                case 3: 
                    lista.listarContactos();
                    pausa();
                    break;
                case 4: 
                    ler.nextLine(); //limpar o buffer do teclado
                    System.out.print("Nome: ");
                    nome = ler.nextLine();
                    lista.remover(nome);
                    pausa();
                    break;
                case 0: return;
                default: System.out.println("--> Opcao Invalida"); 
                    pausa();
                    break; 
            }
           
        } 

    }
}
