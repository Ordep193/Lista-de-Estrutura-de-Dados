package Exercicios.ExeRefe;

import java.util.Scanner;

public class App {
    static FilaQ filaQ = new FilaQ();
    static FilaA filaA = new FilaA();
    static FilaB filaB = new FilaB();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cadastro cad;
        String nome, operacao;
        int op = 0;
        int opCad;
        boolean rodaTudo = true;
        boolean rodaCad = true;
        boolean cadFeito = false;

        while (rodaTudo) {
            switch (op) {
                case 0:
                    System.out.println("     |CADASTRO DE NOMES|");
                    System.out.println("1- Iniciar cadastro\n2- Checar fila de cadastro\n3- Separar filas\n4- Checar resultados finas\n5- Sair");
                    op = in.nextInt();
                    in.nextLine();
                    break;
                case 1:
                    while (rodaCad) {
                        boolean cont=true;
                        System.out.println("Digite o nome");
                        nome = in.nextLine();
                        System.out.println("Digite a operação");
                        operacao = in.nextLine();
                        cad = new Cadastro(nome, operacao);
                        filaQ.enfileirar(cad);

                        while (cont) {
                            System.out.println("Deseja continuar?");
                            System.out.println("1- Sim    2- Não");
                            opCad = in.nextInt();
                            in.nextLine();
                            if(opCad==2){
                                cont=false;
                                rodaCad=false;
                            }else if(opCad==1)
                                cont=false;
                            else
                                System.out.println("Opção inválida\n Tente novamente");
                        }
                    }
                    cadFeito = true;
                    op=0;
                    break;
                case 2:
                    if(filaQ.isVazia() && !cadFeito){
                        System.out.println("Não houve cadastro ainda");
                        op=0;
                        break;
                    }else if(filaQ.isVazia() && cadFeito){
                        System.out.println("Fila já foi separada");
                        op=0;
                        break;
                    }   
                    filaQ.mostrar();
                    op=0;
                    break;
                case 3:
                    try {
                        separador();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("Filas separadas");
                    op=0;
                    break;
                case 4:
                    System.out.println("     |FILA A|");
                    while (!filaA.isVazia()) {
                        try {
                            Cadastro aux = filaA.desenfilerar();
                            System.out.println("Nome: "+aux.getNome());
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }

                        System.out.println("     |FILA B|");
                    while (!filaB.isVazia()) {
                        try {
                            Cadastro aux = filaB.desenfilerar();
                            System.out.println("Nome: "+aux.getNome());
                        } catch (Exception e) {
                            System.out.println(e);
                        }    
                    }

                    System.out.println("Os cadastros estão liberados novamente");
                    cadFeito=false;
                    op=0;
                    break;
                case 5:
                    System.out.println("Fechando programa");
                    op=0;
                    rodaTudo=false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    op=0;
                    break;
            }
        }
        in.close();
    }

    public static void separador()throws Exception{
        while (!filaQ.isVazia()){

            Cadastro aux = filaQ.desenfilerar();
            if(aux.getOperacao().equals("A"))
                filaA.enfileirar(aux);

            if(aux.getOperacao().equals("B"))
                filaB.enfileirar(aux);
                
            if(aux.getOperacao().equals("X")){
                if(filaA.getTamanho()>filaB.getTamanho())
                    filaB.enfileirar(aux);
                if(filaA.getTamanho()<filaB.getTamanho())
                    filaA.enfileirar(aux);
            }
        }
    }
}
