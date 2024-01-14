package Pilha.Aula7;

public class PilhaArr {
    int tan=0;
    Mao topo;

    public boolean isVazia(){
        return tan==0;
    }
    public int getTamanho(){
        return tan;
    }

    public void push(Mao m){
        if(tan!=0)
            m.prox=topo;
        topo=m;
        ++tan;
    }
    public Mao pop() throws Exception{
        if(tan==0)
            throw new Exception("Tá vazia");
        Mao m = topo;
        topo = m.prox;
        --tan;
        return m;
    }
}   
