package Exercicio.Exe3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean fecha = false;
        Scanner in = new Scanner(System.in);
        int op=0;
        Lista lista = new Lista();
        Carro carro;
        while(!fecha){
            switch (op) {
                case 0:
                    System.out.println("|CADASTRO DE CARROS|");
                    System.out.println("1- Cadastrar carro\n2-Listar os carros\n3-Sair");
                    op=in.nextInt();
                    in.nextLine();
                    break;
                case 1:
                    System.out.println("Digite a placa do carro");
                    String placa = in.nextLine();
                    System.out.println("Digite a marca do carro");
                    String marca = in.nextLine();
                    System.out.println("Digite o modelo do carro");
                    String modelo = in.nextLine();
                    System.out.println("Digite o valor do carro");
                    float valor = in.nextFloat();
                    carro = new Carro(placa, marca, modelo, valor);
                    lista.addFim(carro);
                    op=0;
                    break;
                case 2:
                    lista.print();
                    op=0;
                    break;
                case 3:
                    fecha=true;
                    op=0;
                    break;
                default:
                    System.out.println("Opção invãlida");
                    op=0;
                    break;
            }
        }
        in.close();
    }
}
