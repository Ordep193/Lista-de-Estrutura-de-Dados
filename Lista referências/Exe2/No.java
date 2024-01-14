package Exercicio.Exe2;

public class No {
    No proximo;
    Cliente cliente;

    public No(Cliente cli,No prox){
        this.cliente = cli;
        this.proximo = prox;
    }
    public No(){
        this.cliente = null;
        this.proximo = null;
    }

}