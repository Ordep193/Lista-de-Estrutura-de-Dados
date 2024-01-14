package Pilha.Aula7;

import java.util.Random;
import java.util.Scanner;

public class App {
    static Random rand = new Random();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        int pontos1=0,pontos2=0;

        PilhaArr p1 = new PilhaArr();
        PilhaArr p2 = new PilhaArr();

        System.out.println("Mão do 1º jogador");
        pontos1 = pontuador(p1);
        System.out.println("Mão do 2º jogador");
        pontos2 = pontuador(p2);

        if(pontos1>pontos2){
            System.out.println("O 1º jogador ganhou");
            mostrarMao(p1);
        }else if(pontos2>pontos1){
            System.out.println("O 2º jogador ganhou");
            mostrarMao(p2);
        }else
            System.out.println("Empatou");
            
    }

    public static int pontuador(PilhaArr p){
        int carta,pontos=0;
        boolean para=false,storo=false;

        while(!para && !storo){
            carta = rand.nextInt(13)+1;
            System.out.println("Sua carta é: "+carta+" pega ou vaza?");
            String escolha = in.nextLine();
            if(escolha.equals("pega")){
                pontos+=carta;
                if(pontos>21){
                    pontos-=5;
                    System.out.println("Estorou");
                    storo=true;
                }else
                    p.push(new Mao(carta));
            }
            if(escolha.equals("vaza"))
                para=true;
        }
        return pontos;
    }
    public static void mostrarMao(PilhaArr p){
        Mao mao = new Mao();
        while(!p.isVazia())
            try {
                mao = p.pop();
                System.out.println(mao.getCarta());
            } catch (Exception e) {
                System.out.println("Erro: "+e);
            }
    }
}
