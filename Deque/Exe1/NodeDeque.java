package Deque.Exe1;

public class NodeDeque<T> {
    private NodeDeque<T> prox;
    private NodeDeque<T> ant;
    private T info;

    public NodeDeque(T info){
        this.info = info;
        prox = null;
        ant = null;
    }

    public NodeDeque(){
        this(null);
    }

    public NodeDeque<T> getProximo(){
        return prox;
    }

    public void setProximo(NodeDeque<T> prox){
        this.prox = prox;
    }

    public NodeDeque<T> getAnterior(){
        return ant;
    }

    public void setAnterior(NodeDeque<T> ant){
        this.ant = ant;
    }

    public T getInfo(){
        return info;
    }

    public void setInfo(T info){
        this.info = info;
    }
}
