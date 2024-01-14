import java.util.Random;

public class exe2 {
    static int vet[] = new int[100];
    static Random gera = new Random();
    static int fim=0;
    public static void main(String[] args) {
        vet = prencheVetor();

        for (int num : vet) {
            System.out.println(num);
        }
    }

    public static int[] prencheVetor(){
        int posi =0;
        for(int i=0;i<vet.length;i++){
            int op=gera.nextInt(3)+1;
            switch (op) {
                case 1:
                    vet = organiza(0);
                    vet[0]=gera.nextInt(100);
                    fim++;
                    posi=0;
                    break;
                case 2:
                    vet[fim++]=gera.nextInt(100);
                    posi=fim-1;
                    break;
                case 3:
                    vet = organiza(posi);
                    vet[posi]=gera.nextInt(100);
                    fim++;
                    break;
            }
            
        }
        return vet;
    }

    public static int[] organiza(int posi){
        for (int i=fim; i > posi; i--) {
            vet[i]=vet[i-1];
        }
        return vet;
    }
}
