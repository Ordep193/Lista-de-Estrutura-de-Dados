import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,n1=1,n2=1,resu=0;
        n = in.nextInt(); 
        
        for(int i =1;i<n;i++){
            resu = n1+n2;
            n1=n2;
            n2=resu;
        }  
        System.out.println(resu);
        in.close();
    }
}