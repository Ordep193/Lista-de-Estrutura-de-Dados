package Aula4Listas.Exercicio;

public class ListaFilme {
    int tam=1,ultimo=0;
    private Filme[] filmeList;

    public ListaFilme(){
        filmeList = new Filme[tam];
    }
    
    public void add(Filme film) throws Exception{
        if(ultimo==filmeList.length) throw new Exception("não há espaço na lsita de filmes");

        if(ultimo==0) filmeList[0]=film;
        
        else filmeList[++ultimo]=film;
        
    }

    public void aumetarTam(int tamanho){
        tam = tamanho;
        Filme[] listTemp = new Filme[filmeList.length];
        listTemp = filmeList;

        filmeList = new Filme[tam];
        for(int i=0;i<listTemp.length;i++){
            filmeList[i]=listTemp[i];
        }
    }

    public void excluir(int cod){
        for(int i=0;i<filmeList.length;i++){
            if(filmeList[i].getCodigo()==cod){
                for(int j=i;j<filmeList.length;j++){
                    filmeList[j]=filmeList[j+1];
                }
            }
        }
    }

    public Filme pesquisa(String nome){
        for(int i=0;i<filmeList.length;i++){
            if(filmeList[i].getNome().equals(nome)) return filmeList[i];
        }
            return null;
    }

    public void mostrar(){
        for(int i=0;i<ultimo;i++){
            System.out.println(filmeList[i].getCodigo()+" - "+filmeList[i].getNome()+" - "+filmeList[i].getGenero());
        }
    }
}
