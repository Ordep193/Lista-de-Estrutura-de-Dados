package Pilha.Aula8.Exe1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int resu;
        Pilha p = new Pilha();
        Icaa seq=null;

        System.out.println("Qual o tamanho da sequência?");
        int tan = in.nextInt();
        in.nextLine();
        p.push(new Icaa(1));
        p.push(new Icaa(1));

        for(int i=2;i<tan;i++){
            resu=p.topo.num + p.topo.prox.num;
            seq = new Icaa(resu);
            p.push(seq);
        }

        System.out.print("A sua sequência de Iccanobif é: ");
        if(tan==1)
            System.out.println(1);
        else
        while(!p.isVazio()){
            try {
                seq = p.pop();
            } catch (Exception e) {
                System.out.println("Erro ao pegar a sequência");
            }
            System.out.print(seq.num+" ");
        }

        in.close();
    }
}