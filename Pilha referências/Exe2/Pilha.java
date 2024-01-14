package Pilha.Aula8.Exe1;

public class Pilha {
    Icaa topo;
    int tan=0;

    public boolean isVazio(){
        return tan==0;
    }

    public int getTamanho(){
        return tan;
    }

    public void push(Icaa seq){
        if(!isVazio())
            seq.prox=topo;
        topo=seq;
        ++tan;
    }

    public Icaa pop() throws Exception{
        if(isVazio())
            throw new Exception("Está vazio");
        Icaa atu = topo;
        topo = atu.prox;
        --tan;
        return atu;
    }
}
