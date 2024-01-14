package Aula8.Exe3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        int aux=0;;

        try {
            p.push(15, "A");
            p.push(44, "B");
            p.push(81, "A");
            p.push(57, "B");
            p.push(46, "A");
            p.push(84, "B");
            p.push(65, "B");
            p.push(32, "A");
            p.push(23, "B");
            p.push(98, "B");
            //p.push(10000, "B");
            //p.push(20000, "A");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("     A");
        while (!p.isVaziaA()) {
            try {
                aux = p.pop("A");
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(aux);
        }
        System.out.println("     B");
        while (!p.isVaziaB()) {
            try {
                aux = p.pop("B");
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(aux);
        }
        
    }
    
}
