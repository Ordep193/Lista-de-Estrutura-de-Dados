package Exercicio.Exe3;

public class No {
    public Carro elemento;
    public No proximio;
    
    public No(No prox, Carro el){
        this.elemento = el;
        this.proximio = prox;
    }

    public No(){
        this.elemento = null;
        this.proximio = null;
    }
}
