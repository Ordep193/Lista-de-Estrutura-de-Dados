package Exercicios.Exe2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String titulo;
    int id;
    Processos proc;
    Fila fila = new Fila();
    int op=0;
    boolean roda = true;
    while (roda) {
        switch (op) {
            case 0:
                System.out.println("    |CONTROLE DE PROCESSOS|");
                System.out.println("1- incluir processos\n2- Retirar processo\n3- Imprir todos os processos\n4- Buscar um processo\n5- Limpar a fila de processos\n6- Sair");
                op=in.nextInt();
                in.nextLine();
                break;
            
            case 1:
                System.out.println("Qual o titulo do processo?");
                titulo = in.nextLine();
                System.out.println("Qual o codigo do processo?");
                id = in.nextInt();
                in.nextLine();
                proc = new Processos(id, titulo);
                try {
                    fila.enfileirar(proc);
                } catch (Exception e) {
                    System.out.println(e);
                }
                op=0;
                break;
            case 2:
                try {
                    proc = fila.desinfilerar();
                    System.out.println("Processos retirado da fila.");
                    System.out.println("ID: "+ proc.getId());
                    System.out.println("Titulo: "+ proc.getTitulo());
                } catch (Exception e) {
                    System.out.println(e);
                }
                op=0;
                break;
                
            case 3:
                System.out.println("    Lista de processos");
                fila.listar();
                op=0;
                break;
        
            case 4:
                System.out.println("Qual o titulo do processo?");
                titulo = in.nextLine();
                System.out.println("Qual o codigo do processo?");
                id = in.nextInt();
                in.nextLine();
                proc = new Processos(id, titulo);
                try {
                    fila.buscar(proc);
                    System.out.println("Processos encontrado");
                } catch (Exception e) {
                    System.out.println(e);
                }
                op=0;
                break;
        
            case 5:
                fila.limpar();
                System.out.println("    Fila de Processos limpa");
                op=0;
                break;
        
            case 6:
                System.out.println("Fechando aplicação");
                op=0;
                roda=false;
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
