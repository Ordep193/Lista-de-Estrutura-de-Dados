package Aula4Listas.Exercicio;

public class Filme {
    private String nome,genero;
    private int codigo;

    public Filme(String nome,String gem,int cod){
        setNome(nome);
        setGenero(gem);
        setCodigo(cod);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }
}
