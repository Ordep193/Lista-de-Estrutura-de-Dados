package Aula3;

import java.util.Scanner;

public class Exe4 {
    static int[] vet = new int[10];
    static int[] usados = new int[10];
    static int uPos=-1,qtdUsa=-1;
    static Scanner in = new Scanner(System.in);

    public static void add(){
        System.out.println("\nAonde você gostaria de colocar o número?");
        int pos=in.nextInt()-1;
        in.nextLine();

        for(int i=0;i<=qtdUsa;i++){
            if(pos==usados[i]){
                System.out.println("Posição ocupada\n Tente novamente");
                add();
            } 
        }

        System.out.println("Qual número você quer colocar?");
        int num=in.nextInt();
        in.nextLine();
        
        if(uPos<pos){
            uPos=pos;
        }
        vet[pos]=num;
        usados[++qtdUsa]=pos;
    }

    public static void remove(){
        System.out.println("\nAonde você gostaria de remover um número?");
        int pos=in.nextInt()-1;
        in.nextLine();
        boolean tem=false;

        for(int i=0;i<=qtdUsa;i++){
            if(pos==usados[i]) tem=true;
        }

        if(tem){
            for(int i=0;i<=qtdUsa;i++){
            if(usados[i]==pos){
                for(int j=i;j<=qtdUsa;j++){
                    usados[j]=usados[j+1];
                    }
                }
            }
            
            
            vet[pos]=0;
            qtdUsa--;
            uPos=usados[qtdUsa];
        }else{
            System.out.println("Posição invalida\n Tente novamente");
            remove(); 
        }
    }

    public static void listar(){
        System.out.println("|Lista do Vetor|");
        for (int i=0;i<=uPos;i++) {
            System.out.print(vet[i]+" ");
        }
    }

    public static void organiza(){
        int temp;
        for(int i=qtdUsa;i>0;i--){
            if(usados[i]<usados[i-1]){
                temp=usados[i-1];
                usados[i-1]=usados[i];
                usados[i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        boolean rodar=true;
        int op=0;
        
        while(rodar){
            switch (op) {
                case 0:
                    System.out.println("\n        |EXERCÍCIO 4|        ");
                    System.out.println("1-Adicionar número\n2-Excluir um número\n3-Ver lista de números\n4-Sair");
                    op=in.nextInt();
                    in.nextLine();
                    break;
                case 1:
                    if(qtdUsa==-1){
                        System.out.println("O vetor ainda está vazio.");
                        add();
                        op=0;
                    }else{
                        System.out.print("Posições usadas: ");
                        for(int i=0;i<=qtdUsa;i++){
                            System.err.print(usados[i]+1+" ");
                        }
                        add();
                        op=0;
                    }
                    System.out.println("Número adicionado");
                    break;
                case 2:
                    if(qtdUsa==-1){
                        System.out.println("O vetor está vazio.");
                        op=0;
                    }else{
                        System.out.print("Posições usadas: ");
                        for(int i=0;i<=qtdUsa;i++){
                            System.err.print(usados[i]+1+" ");
                        }
                        remove();
                        System.out.println("Número removido");
                        op=0;
                    }
                    
                    break;
                case 3:
                    listar();
                    op=0;
                    break;
                case 4:
                    rodar=false;
                    op=0;
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
