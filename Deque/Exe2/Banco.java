package Deque.Exe2;

public class Banco {
    
    private double valor;

    public Banco(double valor){
        setValor(valor);
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return Double.toString(valor);
    }
}
