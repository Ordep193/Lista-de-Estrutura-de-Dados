package Pilha.Exe1;

public class Pilha {
    static final int MAX_TAM = 100;
    Processo[] pilha = new Processo[MAX_TAM];
    int topo =-1;

    public boolean isVazia(){
        return topo ==-1;
    }
    public int getTamanho(){
        return topo+1;
    }
    public void push(Processo p)throws Exception{
        if(topo==MAX_TAM)
            throw new Exception("Não há espaço disponível");
        pilha[++topo] = p;
    }
    public Processo pop() throws Exception{
        if(isVazia())
            throw new Exception("Lista vazia");
        return pilha[topo--];
    }
    public String pesquisa(int pesquisa) throws Exception{
        int aux = topo;
        int posi = 0;
        if(isVazia())
            throw new Exception("Lista vazia");
            while(pilha[aux].codigo!=pesquisa){
                aux--;
                posi++;
            }
        return "A posição do processo é: "+posi;
    }
}
