public class Exe1 {
    public static void main(String[] args) {
        int VET[] = {7,1,2,3,4,5,8,9};
        int menor =VET[1];
        int maior =VET[1];

        for(int i=0;i<VET.length;i++){
            if(VET[i]<=menor)
                menor = VET[i];
            if(VET[i]>=maior)
                maior = VET[i];
        }
        System.out.println("Maior: "+maior );
        System.out.println("Menor: "+menor);
    }
}
