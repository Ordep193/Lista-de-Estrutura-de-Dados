import java.util.Random;

public class Exe1 {
    static int uPosicao;
    public static void main(String[] args) {
        int vet[] = new int[10];
        Random gera = new Random();
        uPosicao = vet.length-1;

        for(int i=0;i<vet.length;i++)
            vet[i]= (int) gera.nextInt(10);
            
        for(int i=0;i<vet.length;i++)
            System.out.print(vet[i]+" ");

        System.out.println("\n======================");

        for(int i=0;i<uPosicao;i++)
            if(vet[i]%2!=0){
                for (int j = i; j < uPosicao; j++) {
                    vet[j]=vet[j+1];
                }
                i--;
                uPosicao--;
            }
                
        System.out.println("RESULTADO");
        for(int i=0;i<uPosicao;i++){
            System.out.print(vet[i]+" ");
        }
            

    }
}
