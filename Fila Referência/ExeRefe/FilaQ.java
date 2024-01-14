package Exercicios.ExeRefe;

public class FilaQ {
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

    public void mostrar(){
        Cadastro cabecaTemp = cabeca;
        while (cabecaTemp!=null) {
            String nome = cabecaTemp.getNome();
            String opera = cabecaTemp.getOperacao();
            System.out.print("Nome: "+nome+" Operação: "+opera+" ");
            cabecaTemp= cabecaTemp.getProx();
        }
        System.out.println();
    }

    public void separador()throws Exception{
        
    }

    public boolean isVazia(){
        return tam==0;
    }
}
