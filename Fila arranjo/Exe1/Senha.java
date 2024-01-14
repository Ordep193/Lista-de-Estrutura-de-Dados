package Exercicios.Exe1;

public class Senha {
    private String nome;

    public Senha(){}

    public Senha(int s,String n){
        setNome(n);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
