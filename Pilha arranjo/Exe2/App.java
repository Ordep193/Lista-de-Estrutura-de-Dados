package Pilha.Exe2;

import java.util.Scanner;

class App{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Pilha p = new Pilha();
        System.out.println("Digete a conta a ser testada");
        String conta = in.nextLine();

        for(int i=0;i<conta.length();i++){
            if(conta.charAt(i)==('('))
                try {
                    p.push();    
                } catch (Exception e) {
                    System.out.println(e);
                    break;
                }
            else if(conta.charAt(i)==')')
                try {
                    p.pop();    
                } catch (Exception e) {
                    System.out.println(e);
                    break;
                }
        }
        if(!p.isVazia())
            System.out.println("Conta inválida");
        else
            System.out.println("Conta válida");
        in.close();
    }
}
