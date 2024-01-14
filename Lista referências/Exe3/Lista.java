package Exercicio.Exe3;

public class Lista {
    private No cabeca = new No();
    private No cauda = cabeca;
    private No elemento;

    public int tamanho = 0;

    public void addInicio(Carro el){
        elemento = new No(null, el);
        if(tamanho == 0){
            cabeca.proximio = elemento;
            cauda = elemento;
        }else{
            elemento.proximio = cauda.proximio;
            cauda.proximio = elemento;
        }
        tamanho++;
    }

    public void addFim(Carro el){
        if(tamanho == 0){
            addInicio(el);
        }else{
            elemento = new No(null,el);
            cauda.proximio=elemento;
            cauda = elemento;
            tamanho++;
        }
    }

    public void add(Carro el,int posicao){
        if(posicao >= tamanho)
            addFim(el);
        if(posicao ==0)
            addInicio(el);
        else{
            elemento = new No(null, el);
            No elem = cabeca.proximio;

            for (int i = 0; i < posicao; i++) {
                elem = elem.proximio;
            }

            elemento.proximio = elem.proximio;
            elem.proximio = elemento;
            tamanho++;
        }       
    }

    public void print(){
        No el = cabeca.proximio;
        int num = 1;
        while (el!=null){
            System.out.println("     |Carro "+num+"|    ");
            System.out.println("Placa: " + el.elemento.getPlaca());
            System.out.println("Marca: " + el.elemento.getMarca());
            System.out.println("Modelo: " + el.elemento.getModelo());
            System.out.println("Valor: " + el.elemento.getValor());
            num++;
            el = el.proximio;
        }
    }

    public int getTamanho(){
        return this.tamanho;
    }
}