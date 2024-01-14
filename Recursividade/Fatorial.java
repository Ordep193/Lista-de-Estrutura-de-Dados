import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n,resu=1;
        n = in.nextInt();
        for(int i =n;i>0;i--){
            resu*=i;
        }
        System.out.println(resu);
        in.close();
    }
}
