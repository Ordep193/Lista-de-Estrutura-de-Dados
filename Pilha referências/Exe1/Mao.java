package Pilha.Aula7;

public class Mao {
    int carta;
    Mao prox;

    public Mao(){}

    public Mao(int carta){
        this.carta=carta;
        this.prox=null;
    }

    public int getCarta(){
        return carta;
    }

}
