import java.util.Scanner;

public class Exe2 {
    static final int VET[] = {1,2,3,4,5,6,7,8,9,9,9};
    //Sistema de arvore
    public static boolean busca(int n,int ini,int fim){
        if(n==VET[fim]) return true;
        else if(ini==fim) return false;
        else if(n>VET[fim]){
            ini= fim;
            fim =(ini+VET.length)/2;
            return busca(n, ini, fim);
        }else{
           fim =(ini+fim)/2;
            return busca(n, ini, fim);
        }
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Qual número tú que?");
        int n = in.nextInt();
        int i=0;
        int j=(i+VET.length)/2;

        if(busca(n,i,j)) System.out.println("Achamo");
        else System.out.println("Não achamo");
        in.close();
    }
}