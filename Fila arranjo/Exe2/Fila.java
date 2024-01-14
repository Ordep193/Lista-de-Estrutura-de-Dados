package Exercicios.Exe2;

public class Fila {
    static final int TAM_MAX = 7;

    int ini=0;
    int fim=0;
    int tam=0;

    Processos vet[] = new Processos[TAM_MAX];

    public void enfileirar(Processos pros) throws Exception{
        if(isFull())
            throw new Exception("Tá cheio");
        
        vet[fim]=pros;
        fim++;

        if(fim==TAM_MAX)
            fim=0;
        
        tam++;
    }

    public Processos desinfilerar()throws Exception{
        if(isVazia())
            throw new Exception("Tá vazio");
        
        Processos temp = vet[ini];
        ini++;

        if(ini==TAM_MAX)
            ini=0;

        tam--;
        return temp;
    }

    public Processos buscar(Processos p)throws Exception{
        int j = ini;
        for (int i = 0; i < tam; i++) {
            if(j==TAM_MAX)
                j=0;   
            
            if(vet[j].getId() == p.getId() && vet[j].getTitulo().equals(p.getTitulo()))
                return vet[j];
                    
            j++; 
        }
        throw new Exception("Não encontrado");
    }

    public void listar(){
        int j = ini;
        for (int i = 0; i < tam; i++) {
                if(j==TAM_MAX)
                    j=0;   
                System.out.println("ID:" + vet[j].getId());
                System.out.println("TITULO: "+vet[j].getTitulo());
                j++; 
        }
    }

    public void limpar(){
        ini=0;
        fim=0;
        tam=0;
        vet[0]=null;
    }

    public boolean isVazia(){
        return tam==0;
    }

    public boolean isFull(){
        return tam==TAM_MAX;
    } 
}
