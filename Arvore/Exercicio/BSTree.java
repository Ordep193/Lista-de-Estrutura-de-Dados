package Exemplo.Exercicio;

public class BSTree {
    Node raiz=null;

    public void inserir(Node no, double matricula,String nome, String curso){
        if(no!=null){
            if(matricula < no.matricula){
                if(no.esquerda !=null)
                    inserir(no.esquerda, matricula, nome, curso);
                else
                    no.esquerda = new Node(matricula, nome, curso);
            }else{
                if(no.direita !=null){
                    inserir(no.direita, matricula, nome, curso);
                }else
                    no.direita = new Node(matricula, nome, curso);
            }       
        }else
            raiz = new Node(matricula, nome, curso);
    }

    public Node remover(double matricula) throws Exception{
        return remover(this.raiz,matricula);
    }

    private Node remover(Node no, double matricula) throws Exception{
        boolean ajuste = false;
        if(no == null) throw new Exception("Matricula não encontrada");
        if(this.raiz == null) throw new Exception("Árvore vazia");
        else{
            if(matricula < no.matricula){
                no.esquerda = remover(no.esquerda, matricula);
            }else if(matricula > no.matricula){
                no.direita = remover(no.direita,matricula);
            }else{
                if(no.direita!=null && no.esquerda!=null){
                    no.matricula = minimo(no.direita).matricula;
                    no.direita = removeMinimo(no.direita);
                }else{
                    if(no == raiz){
                        ajuste = true;
                    }
                    no = (no.esquerda!=null) ? no.esquerda: no.direita;
                    if( ajuste) raiz= no;
                }
            }
            return no;
        }
    }

    public boolean cadastrado(Node no, double matricula) throws Exception{
        if(no == null) throw new Exception("Não cadastrado(a)");
        if(this.raiz == null) throw new Exception("Árvore vazia");
        else{
            if(matricula < no.matricula){
                cadastrado(no.esquerda, matricula);
            }else if(matricula > no.matricula){
                cadastrado(no.direita,matricula);
            }
            return true;
        }
    }

    private Node minimo(Node no) throws Exception{
        if(no==null)
            throw new Exception("Raiz nula");
        if(no.esquerda!=null)
            return minimo(no.esquerda);
        else
            return no;
    }

    private Node removeMinimo(Node no) throws Exception{
        if(no == null)
            throw new Exception("Raiz nula");
        else
            if(no.esquerda!=null){
                no.esquerda = (removeMinimo(no.esquerda));
                return no;
            }else
                return no.direita;
    }

    public void maximo(Node no)throws Exception{
        if(no==null)
            throw new Exception("Raiz nula");
        if(no.direita!=null)
            maximo(no.direita);
        else
            System.out.print(no + " ");
    }

    public void preOrdem (Node no){
        if (no!=null){
            System.out.print(no + " ");
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }
    
}
