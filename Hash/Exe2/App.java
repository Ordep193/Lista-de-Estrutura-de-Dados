import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashTable table = new HashTable();
        Boolean fecha= false;
        int op = 0;

        String nome,presi,tec;
        int cod,anoFund;

        while (!fecha) {
            switch (op) {
                case 0:
                    System.out.println("     Tabela da Times");
                    System.out.println("1-Cadastrar um time\n2-Buscar um time\n3-Remover um time\n4-Checar status da tabla\n5-Sair");
                    op=in.nextInt();
                    in.nextLine();
                    break;
                case 1:
                    System.out.println("Digite o código do time");
                    cod = in.nextInt();
                    in.nextLine();
                    System.out.println("Digite o nome do time");
                    nome = in.nextLine();
                    System.out.println("Digite o ano de fundação do time");
                    anoFund = in.nextInt();
                    in.nextLine();
                    System.out.println("Digite o nome do presidente do time");
                    presi = in.nextLine();
                    System.out.println("Digite o o nome do tecnico do time");
                    tec = in.nextLine();
                    table.put(new Time(cod, nome, anoFund, presi, tec));

                    op=0;
                    break;
                case 2:
                    System.out.println("Digite o código do time que você busca");
                    cod= in.nextInt();
                    in.nextLine();
                    try {
                        Time aux = table.get(cod);
                        System.out.println("Nome: "+aux.getNome()+"\nAno de fundação: "+aux.getAnoFundacao()+"\nPresidente: "+aux.getPresidente()+"\nTecnico: "+aux.getTecnico());
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    op=0;
                    break;
                case 3:
                    System.out.println("Digite o código do time que você quer remover");
                    cod= in.nextInt();
                    in.nextLine();
                    try {
                        Time aux = table.remove(cod);
                        System.out.println("Nome: "+aux.getNome()+"\nAno de fundação: "+aux.getAnoFundacao()+"\nPresidente: "+aux.getPresidente()+"\nTecnico: "+aux.getTecnico());
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    op=0;
                    break;
                case 4:
                    System.out.println("    Status da Tabela");
                    table.status();
                    op=0;
                    break;
                case 5:
                    System.out.println("Fechando o aplicativo");
                    op=0;
                    fecha=true;
                    break;
                default:
                    System.out.println("Opção inválida");
                    op=0;
                    break;
            }
        }
        in.close();
    }
}
