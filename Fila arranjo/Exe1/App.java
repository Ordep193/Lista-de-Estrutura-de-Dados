package Exercicios.Exe1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        boolean roda = true;
        Fila fila = new Fila();
        int op = 0;

        while(roda){
            switch (op) {
                case 0:
                    System.out.println("|SISTEMA DE SENHAS|");
                    System.out.println("1-Pegar senha\n2-Próximo!!!!!\n3-Encerrar");
                    op=in.nextInt();
                    in.nextLine();
                    
                    break;
                case 1:
                    System.out.println("Qual teu nome?");
                    nome=in.nextLine();

                    try {
                        fila.enfileirar(nome);    
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    op=0;
                    break;
                case 2:
                    try {
                        System.out.println("O próximo da fila é: "+fila.desinfilerar());
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    op=0;
                    break;
                case 3:
                    System.out.println("Fechando o aplicativo");
                    op=0;
                    roda=false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    op=0;
                    break;
            }
        } 
    }
    
}
