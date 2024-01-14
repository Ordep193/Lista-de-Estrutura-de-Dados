package Aula8.Exe3;

public class Pilha {
    static final int MAX_TAM = 10;
    int[] pilha = new int[MAX_TAM];
    int topo = -1;
    int fundo = 10;
    int tan=0;


    public int getTamanhoA(){
        return topo+1;
    }

    public int getTamanhoB(){
        return 11-fundo;
    }

    public void push(int n,String op)throws Exception{
        if(topo==MAX_TAM || fundo==0 || tan==10)
            throw new Exception("A pilha tá cheia");
        if(op.equals("A")){
            pilha[++topo]=n;
            tan++;
        }else{
            pilha[--fundo]=n;
            tan++;
        }
    }

    public int pop(String op)throws Exception{
        if(isVaziaA() && isVaziaB())
            throw new Exception("A pilha tá vazia");
        if(op.equals("A"))
            return pilha[topo--];
        else{
            return pilha[fundo++];
        }
            
    }

    public boolean isVaziaA(){
        return topo==-1;
    }
    public boolean isVaziaB(){
        return fundo==10;
    }
}
