package Exercicio.Exe3;

public class Carro {
    private String placa;
    private String marca;
    private String modelo;
    private double valor;

    public Carro(String placa, String marca,String modelo, double valor){
        setMarca(marca);
        setModelo(modelo);
        setPlaca(placa);
        setValor(valor);
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }    
}
