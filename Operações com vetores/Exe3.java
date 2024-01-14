package Aula3;

import java.util.Scanner;

public class Exe3 {
    private static String[] convidados = new String[10];
    static int fim=0;
    static Scanner in = new Scanner(System.in);

    public static void cadastrar(){
        System.out.println("Digite o nome do convidado");
        convidados[fim++]=in.nextLine();
    }

    public static void listarConvi(){
        System.out.println("|Lista de Convidados|");
        for(int i=0;i<fim;i++)
            System.out.println(i+1+" "+convidados[i]);
    }
    public static void excluiConvi(int esco){
        for(int i=esco;i<=fim;i++){
            convidados[i]=convidados[i+1];
        }
        fim--;
    }

    public static void main(String[] args) {
        int op=0;
        boolean end=true;
        while (end) {
            switch (op) {
            case 0:
                System.out.println("|Sistema de Cadastro de convidados|");
                System.out.println("1-Cadastrar um convidado\n2-Excluir um convidado\n3-Listar os convidados\n4-sair");
                op = in.nextInt();
                in.nextLine();
                break;
            case 1:
                if(fim<10)
                    cadastrar();
                else
                    System.out.println("A lista de convidados está cheia");
                op=0;
                break;
            case 2:
                listarConvi();
                System.out.println("Digite o número de quem você deseja apagar?");
                int exclui=in.nextInt()-1;
                in.nextLine();
                excluiConvi(exclui);
                op=0;
                break;
            case 3:
                listarConvi();
                System.out.println();
                 op=0;
                break;
            case 4:
                end=false;
                break;
            default:
                System.out.println("Opção inválida");
                op=0;
                break;
        }
        }
        in.close();
    }
}
