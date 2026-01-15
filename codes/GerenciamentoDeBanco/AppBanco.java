import java.util.Scanner;
import java.util.List;

public class AppBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Conta> contas = BancoDados.carregar();

        System.out.println("SISTEMA BANCÁRIO REAL - Contas carregadas: " + contas.size());

        while (true) {
            System.out.print("\n1-Cadastrar | 2-Listar | 3-Sair: ");
            String op = sc.nextLine();

            if (op.equals("3")) break;

            if (op.equals("1")) {
                try {
                    System.out.print("Nome: "); String nome = sc.nextLine();
                    System.out.print("Idade: "); int idade = Integer.parseInt(sc.nextLine());
                    System.out.print("Saldo Inicial: "); double saldo = Double.parseDouble(sc.nextLine());

                    String num = "BC-" + (contas.size() + 100);
                    contas.add(new Conta(nome, idade, num, saldo));
                    BancoDados.salvar(contas);
                    System.out.println("Salvo com sucesso!");
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            } else if (op.equals("2")) {
                contas.forEach(System.out::println);
            }
        }
        sc.close();
    }
}