package Exercicio.Exe2;

import Exercicio.Exe1.este;

public class ListaEncadeada {
    public No cabeça = new No();
    public No cauda = cabeça;
    public No elemento;

    public int tamanho = 0;

    public void addInicio(Cliente c){
        elemento = new No(c,null);
        if(tamanho==0){
            cabeça.proximo=elemento;
            cauda = elemento;
        }else{
            elemento.proximo=cabeça.proximo;
            cabeça.proximo=elemento;
        }
        tamanho++;
    }

    public void addFim(Cliente c){
        elemento = new No(c,null);
        if(tamanho==0){
            addInicio(c);
        }else{
            elemento = new No(c,null);
            cauda.proximo=elemento;
            cauda=elemento;
            tamanho++;
        }
    }

    public void add(Cliente c)throws Exception{
        elemento = new No(c,null);
        if(tamanho==0){
            addInicio(c);
        }else if(elemento.cliente.getCod()<cabeça.cliente.getCod()){
            addInicio(c);
        }else if(elemento.cliente.getCod()>cauda.cliente.getCod()){
            addFim(c);
        }else{
            No el = new No();
            el=cabeça.proximo;
            No anteri=el;
            while(elemento.cliente.getCod()>el.cliente.getCod()){
                anteri=el;
                el=el.proximo;
            }
            anteri.proximo=elemento;
            elemento.proximo=el;
        }
        
    }
}
