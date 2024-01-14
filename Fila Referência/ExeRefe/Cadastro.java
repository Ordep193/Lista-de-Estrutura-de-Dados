package Exercicios.ExeRefe;

public class Cadastro {
    private String nome;
    private String operacao;
    private Cadastro prox;

    public Cadastro(String nome,String op){
        setNome(nome);
        setOperacao(op);
        setProx(null);
    }

    
    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public Cadastro getProx() {
        return prox;
    }

    public void setProx(Cadastro prox) {
        this.prox = prox;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}