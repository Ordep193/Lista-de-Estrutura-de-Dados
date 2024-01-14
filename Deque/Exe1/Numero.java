package Deque.Exe1;

public class Numero {
    private int valor;

    public Numero(int valor){
        setValor(valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return Integer.toString(valor);
    }

}
