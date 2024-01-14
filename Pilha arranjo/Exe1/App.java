package Pilha.Exe1;

import java.util.Scanner;

public class App {
    static Pilha afonsoP = new Pilha();
    static Pilha rosiP = new Pilha();
    static Pilha anaP = new Pilha();
    public static void main(String[] args) throws Exception{
        Pilha p = new Pilha();
        Scanner in = new Scanner(System.in);
        p.push(new Processo(1,"Rosimere","Acme"));
        p.push(new Processo(2,"Afonso","Sansug"));
        p.push(new Processo(3,"Rosimere","Lenovo"));
        p.push(new Processo(4,"Ana","Acme"));
        p.push(new Processo(5,"Afonso","Sansug"));
        p.push(new Processo(6,"Rosimere","Lenovo"));

        System.out.println("Qual código?");
        int pesq = in.nextInt();
        System.out.println(p.pesquisa(pesq));
        System.out.println("");

        System.out.println("Lista de processos a serem executados:");
        ListarIni(p);
        //Rosi
        System.out.println("Lista de processos da Rosimere:");
        Listar(rosiP);
        //Ana
        System.out.println("Lista de processos da Ana:");
        Listar(anaP);
        //Afonso
        System.out.println("Lista de processos do Afonso:");
        Listar(afonsoP);

        in.close();
    }
    public static void Listar(Pilha p) throws Exception{
        Processo proc = new Processo();
        while(!p.isVazia()){
            proc = p.pop();
            System.out.printf("Responsável: %s\t\t Código: %d\tCliente: %s\n",proc.responsavel,proc.codigo,proc.cliente);
        }
    }
    public static void ListarIni(Pilha p) throws Exception{
        Processo proc = new Processo();
        while(!p.isVazia()){
            proc = p.pop();
            System.out.printf("Responsável: %s\t\t Código: %d\tCliente: %s\n",proc.responsavel,proc.codigo,proc.cliente);
            if(proc.responsavel=="Afonso") afonsoP.push(proc);
            else if(proc.responsavel=="Rosimere") rosiP.push(proc);
            else anaP.push(proc);
        }
    }
}
