import java.util.ArrayList;
import java.util.Iterator;

public class HashTable {
    public static final int M = 17;
    private ArrayList<Time>[] tabela;

    public HashTable(){
        tabela = (ArrayList<Time>[]) new ArrayList[M];
    }

    private int hash(int cod){
        int h = (957 * (7 + cod))%M;
        return h;
    }

    public Time get(int cod)throws Exception{
        int hash = hash(cod);
        ArrayList<Time> times = tabela[hash];

        if(times == null)
            throw new Exception("Time não encontrado");
        for (Time time : times) {
            if(time.getCodigo()==cod)
            return time;
        }
        throw new Exception("Time não encontrado");
    }

    public void put(Time t){
        int hash = hash(t.getCodigo());
        ArrayList<Time> times = tabela[hash];

        if(times == null){
            times = new ArrayList<Time>();
            times.add(t);
            tabela[hash] = times;
        }else{
            boolean achei = false;
            for (Time time : times)
                if(time.getCodigo() == t.getCodigo())
                    achei = true;
            if(!achei){
                times.add(t);
            }
        }
    }

    public Time remove(int cod)throws Exception{
        int hash = hash(cod);
        ArrayList<Time> times = tabela[hash];
        Iterator<Time> it = times.iterator();
        Time atual = null;

        while (it.hasNext()) {
            atual = it.next();
            if(atual.getCodigo() == cod){
                it.remove();
                return atual;
            }
        }
        throw new Exception("Time não encontrado");
    }

    public void status(){
        for (int i = 0; i < M; i++) {
            if(tabela[i]!=null){
                ArrayList<Time> t = tabela[i];
                System.out.printf("A posição %d possui %d times\n",i,t.size());
            } else
                System.out.printf("A posição %d possui %d times\n",i);
        }
    }
}
