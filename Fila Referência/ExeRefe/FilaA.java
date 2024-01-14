package Exercicios.ExeRefe;

public class FilaA {
    private Cadastro cabeca;
    private Cadastro cauda;

    private int tam = 0;

    public void enfileirar(Cadastro el){
        if(tam!=0)
            cauda.setProx(el);
        else
            cabeca=el;

        cauda = el;
        tam++;
    }

    public Cadastro desenfilerar() throws Exception{
        if(isVazia())
            throw new Exception("Tá vazia");

        Cadastro aux = cabeca;
        cabeca = cabeca.getProx();
        tam--;
        return aux;
    }

    public boolean isVazia(){
        return tam==0;
    }

    public int getTamanho(){
        return tam;
    }
}
