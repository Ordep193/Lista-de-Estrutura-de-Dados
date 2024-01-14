package Exemplo.Exercicio;

public class App {
    public static void main(String[] args) {
        BSTree bst = new BSTree();
        bst.inserir(bst.raiz, 21, "Pedro", "BSI");
        bst.inserir(bst.raiz, 43, "Maria", "ADS");
        bst.inserir(bst.raiz, 70, "João", "ADS");
        bst.inserir(bst.raiz, 96, "Ana", "ADS");
        bst.inserir(bst.raiz, 45, "José", "ADS");
        bst.inserir(bst.raiz, 9, "Lucas", "ADS");
        bst.inserir(bst.raiz, 27, "Miguel", "ADS");
        bst.inserir(bst.raiz, 39, "Rafael", "ADS");
        bst.inserir(bst.raiz, 89, "Gabriel", "ADS");
        bst.inserir(bst.raiz, 63, "Isabela", "ADS");
        bst.inserir(bst.raiz, 5, "Larissa", "ADS");

        bst.preOrdem(bst.raiz);
        System.out.println("\n    Máximo");
        try {
            bst.maximo(bst.raiz);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("\n    Busca");
        try {
            if(bst.cadastrado(bst.raiz,63))
                System.out.println("Cadastrado(a)");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            bst.remover(63);
        } catch (Exception e) {
            System.out.println(e);
        }
        bst.preOrdem(bst.raiz);
        System.out.println("\n    Busca do removido");
        try {
            if(bst.cadastrado(bst.raiz,63))
                System.out.println("Cadastrado(a)");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
