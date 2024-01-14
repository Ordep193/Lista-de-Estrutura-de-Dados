import java.util.Scanner;

public class Potencia {
    public static long pont(int n,int base){
        if(base==0)
            return 1;
        else if(base==1)
            return n;
        else{
                n*=2;
                base--;
            return pont(n,base);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ba;
        ba=in.nextInt();
        System.out.println(pont(2,ba));
        in.close();
    }
}
