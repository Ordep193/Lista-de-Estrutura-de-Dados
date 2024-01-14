import java.util.Scanner;

public class Primo {
    public static boolean isPrimo(int n,int i){
        if(n==1)
            return true;
        else 
            if(n%i==0)
                return false;
            else
                return isPrimo(n, i-1);
    }
    public static boolean isPrimo(int n){
        if(n==1)
            return false;
        else 
            return isPrimo(n,n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(isPrimo(n))
            System.out.println("É um primo");
        else
            System.out.println("Não é um primo");

        in.close();
    }
}
