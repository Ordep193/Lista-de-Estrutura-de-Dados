package Aula4;

import java.util.Scanner;

public class Exercicio {
    static private int[] vetA=new int[10];
    static private int[] vetB=new int[10];
    static private int[] vetF=new int[20];
    static int uPosA=0,uPosB=0,uPosF=0;

    public static int[] bota(int[]v,int num,int pos){
        if(pos==0){
            pos++;
            v[0]=num;
            return v;
        }else if(num>=v[pos-1]){
                v[pos++]=num;
            return v;
        }else{
            v[pos]=v[pos-1];
            pos--;
            return bota(v, num, pos);
        }
    }
    public static void poli(int[] vA,int[] vB){
        int i=0,j=0;
        uPosF=uPosA+uPosB;
        for(int tam=0;tam<=uPosF;tam++){
            if(vA[j]>vB[i]){
                if(i==uPosB) vetF[tam]=vA[j];
                else vetF[tam]=vB[i];
                i++;
            }else{
                if(j==uPosA) vetF[tam]=vB[i];
                else vetF[tam]=vA[j];
                j++;
            }
        }
    }
    public static void exibir(int v[],int tam){
        for(int i=0;i<tam;i++){
            System.out.print(v[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean fim=true;
        int op=0,num;
        while(fim){
            switch (op) {
                case 0:
                    System.out.println("\n|Exercício pika|");
                    System.out.println("1-Adiconar ao vetor A\n2-Adiconar ao vetor B\n3-Fundir vetores\n4-Mostrar vetores\n5-Sair");
                    op = in.nextInt();
                    break;
                case 1:
                    if(uPosA<=9){
                        System.out.println("Qual número você quer inserir");
                        num = in.nextInt();
                        in.nextLine();
                        bota(vetA,num,uPosA);
                        uPosA++;
                        op=0;
                    }else{
                       System.out.println("O vetor está cheio");
                       op=0;
                    } 
                    break;
                case 2:
                    if(uPosB<=9){
                        System.out.println("Qual número você quer inserir");
                        num = in.nextInt();
                        in.nextLine();
                        bota(vetB,num,uPosB);
                        uPosB++;
                        op=0;
                    }else{
                       System.out.println("O vetor está cheio");
                       op=0;
                    } 
                    break;
                case 3:
                    System.out.println("Fazendo a fusão");
                    poli(vetB, vetA);
                    op=0;
                    break;
                case 4:
                    System.out.println("|Vetor A|");
                    exibir(vetA, uPosA);
                    System.out.println("\n|Vetor B|");
                    exibir(vetB, uPosB);
                    System.out.println("\n|Vetor Fundido|");
                    exibir(vetF, uPosF);
                    op=0;
                    break;
                case 5:
                    System.out.println("Programa encerrado");
                    fim=false;
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