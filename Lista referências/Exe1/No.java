package Exercicio.Exe1;

public class No {
    public No proximo,anterior;
    public Pessoa elemento;
    public No (Pessoa elemento, No proximo,No anterior){
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior =  anterior;
    }
    public No(){
        this.elemento = null;
        this.proximo = null;
        this.anterior = null;
    }
}
