package Exercicio.Exe1;

public class ListaEncadeada {
    private No cabeca = new No();
    private No cauda = cabeca;
    private No elemento;

    public int tamanho = 0;
    
    public void addInicio(Pessoa p){
        elemento = new No(p, null,null);
        if (tamanho == 0){
            cabeca.proximo = elemento;
            cabeca.anterior = null;
            cauda = elemento;
        } else {
            elemento.proximo = cabeca.proximo;
            cabeca.proximo.anterior = elemento; 
            cabeca.proximo = elemento;
        }
        tamanho++;
    }
    
    public void addFim(Pessoa p){
        if (tamanho==0)
            addInicio(p);
        else{
            elemento = new No(p,null,null);
            cauda.proximo = elemento;
            elemento.anterior = cauda;
            cauda = elemento;
            tamanho++;
        }
        
    }

    public void add(int posicao, Pessoa p){
        if (posicao>=tamanho)
            addFim(p);
        else if (posicao==0)
            addInicio(p);
        else {
            elemento = new No(p, null,null);
            // Pegamos o elemento que vem antes da posição que iremos inserir
            // O proximo do elemento que iremos inserir passa a ser o proximo de seu predecessor
            // O proximo do predecessor passa a ser o elemento
            No el = cabeca.proximo;
            for (int i=1;i<posicao;++i) // comeca em 1 pois o el já está no primeiro elemento (0)
                el = el.proximo;
                
            elemento.anterior=el;//olhar aqui ordem errada
            elemento.proximo = el.proximo;
            el.proximo = elemento;
            
            elemento.proximo.anterior=elemento;  
            tamanho++;
        }
    }

    public void removeInicio() throws Exception{
        if (tamanho == 0)
            throw new Exception("Lista vazia");
        cabeca.proximo = cabeca.proximo.proximo;

        if(tamanho>1)
            cabeca.proximo.anterior=null;

        tamanho--;
        if (tamanho == 0)
            cauda = null;
    }
    public void removeFim() throws Exception{
        if (tamanho == 0)
            throw new Exception("Lista vazia");
        if (tamanho == 1)
            removeInicio();
        else {
            elemento = new No();
            elemento = cauda.anterior;
            cauda = elemento;
            elemento.proximo=null;
        }
    }

    public void remove(int posicao) throws Exception{
        //possição estão sendo consideradas como vetores
        if(tamanho==0)
            throw new Exception("Lista vazia.");
        if (posicao>=tamanho)
            throw new Exception("O elemento especificado não existe.");
        if (posicao==0)
            removeInicio();
        else if (posicao==tamanho-1)
            removeFim();
        else {
            No el = cabeca.proximo;
            // Pegamos o anterior ao que será removido
            for (int i=1;i<posicao;++i) // comeca em 1 pois o el já está no primeiro elemento (0)
                el = el.proximo;
            el.proximo = el.proximo.proximo;
            el.proximo.anterior = el;
            tamanho--;
        }
    }


    public void print(){
        No el = cabeca.proximo;
        while (el!=null){
            System.out.println("Nome: " + el.elemento.nome);
            System.out.println("Idade: " + el.elemento.idade);

            el = el.proximo;
        }
    }
    public void tnirp(){
        No el = cauda.proximo;
        while(el!=null){
            System.out.println("Nome: " + el.elemento.nome);
            System.out.println("Idade: " + el.elemento.idade);

            el = el.anterior;
        }
    }
    public int tamanho(){
        return tamanho;
    }
}
