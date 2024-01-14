package Exemplo.Exercicio;

public class Node {
    double matricula;
    String nome;
    String curso;
    Node esquerda;
    Node direita;

    public Node(double matricula,String nome, String curso){
        this.matricula=matricula;
        this.nome=nome;
        this.curso=curso;
        esquerda=null;
        direita=null;
    }

    public String toString(){
        return String.valueOf(matricula)+ " - " + nome + " - " + curso;
    }
}
