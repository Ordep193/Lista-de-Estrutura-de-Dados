package Exercicios.Exe1;

public class Fila {
    static final int TAM_MAX=50;

    String vet[] = new String[TAM_MAX];

    int ini =0;
    int fim =0;
    int tamanho =0;

    public void enfileirar(String s)throws Exception{
        if(isFull())
            throw new Exception("Tá cheio");
        vet[fim]=s;
        fim++;
        if(fim == TAM_MAX)
            fim=0;

        tamanho++;
    }

    public String desinfilerar() throws Exception{
        if(isVazia())
            throw new Exception("Tá vazio");
        String temp = vet[ini];
        ini++;

        if(ini==TAM_MAX)
            ini=0;

        tamanho--;
        return temp;
    }

    public boolean isFull(){
        return TAM_MAX == tamanho;
    }

    public boolean isVazia(){
        return tamanho==0;
    }
}