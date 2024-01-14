import java.util.ArrayList;

public class HashTable {
    public static final int M = 13;
    private ArrayList<Livro>[] tabela;
    private Livro tabela2[] = new Livro[13];

    public HashTable(){
        tabela = (ArrayList<Livro>[]) new ArrayList[M];
    }

    private int hash (String chave){
         int h = 0;
         for (int i = 0; i < chave.length(); ++i)
             h = (31 * h + chave.charAt(i)) % M;
         return h;
         // No lugar do multiplicador 31, poderia usar qualquer outro inteiro R, de preferência primo, mas suficientemente pequeno para que os cálculos não produzam overflow.
     }
    
    public void putAberto(Livro l)throws Exception{
        int salto,hash;
        for (salto = 0; salto < tabela2.length; salto++) {
            hash = (hash(l.getISBN())+salto)%tabela2.length;

            if((tabela2[hash] == null) || tabela2[hash].getISBN().equals(l.getISBN())){
                tabela2[hash] = l;
                break;
            }
        }
        if(salto ==tabela.length)
            throw new Exception("Sem espaço");
    }

    public Livro get(String chave){
        int hash = hash(chave);

        for (int salto = 0; salto < tabela.length; salto++) {
            hash = (hash+salto)%tabela2.length;

            if(tabela2[hash].getISBN().equals(chave)) {
                return tabela2[hash];
            }   
        }
        return null;
    }

    public Livro remove(String chave) {
        int hash = hash(chave);
        Livro atual;
        for (int salto = 0; salto < tabela.length; salto++) {
            hash = (hash+salto)%tabela2.length;

            if(tabela2[hash].getISBN().equals(chave)) {
                atual = tabela2[hash];
                tabela2[hash]=null;
                return atual;
            }   
        }
        return null;
    }

    public void status(){
        for (int i=0;i<M;++i){
            if (tabela2[i]!=null){
                //ArrayList<Livro> liv = tabela[i];
                System.out.printf("A posição %d possui %d livros\n",i,1);
            } else
                System.out.printf("A posição %d não possui livros cadastrados\n",i);
        }
    }
}
