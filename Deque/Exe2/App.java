package Deque.Exe2;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double valor=0;
    int op=0,parce;
    boolean fica = true;

    Deque<Banco> deque = new Deque<Banco>();

    while (fica) {
        switch (op) {
            case 0:
                System.out.println("      ||BANCO IF||");
                System.out.println("1-Fazer financiamento\n2-Exibir parcelas\n3-Pagar uma parcela\n4-Adiantar parcela\n5-Sair");
                op=in.nextInt();
                in.nextLine();
                break;
            case 1:
                System.out.println("Qual o valor do finasnciamento?");
                valor = in .nextDouble();
                in.nextLine();
                System.out.println("Por quanto tempo você ira parcelar?");
                parce = in.nextInt();
                in.nextLine();
                valor = valor/parce;
                for (int i = 1; i <= parce; i++) {
                    double tempvalor =valor+(valor*0.01)*i;
                    deque.addLast(new Banco(tempvalor));
                }
                op=0;
                break;
            case 2:
                System.out.println("      |PARCELAS|");

                try {
                    deque.print();
                } catch (Exception e) {
                    System.out.println(e);
                }
                op=0;
                break;
            case 3:
                try {
                    System.out.println("Parecela: "+deque.removeFirst().getValor()+"  paga");;
                } catch (Exception e) {
                    System.out.println(e);
                }
                op=0;
                break;
            case 4:
                try {
                    System.out.println("Parecela: "+deque.removeLast().getValor()+"  paga");;
                } catch (Exception e) {
                    System.out.println(e);
                }
                op=0;
                break;
            case 5:
                System.out.println("Fechando o sistema.");
                fica=false;
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
