package ibmec.edu.br.resources;
import java.util.Scanner;
import ibmec.edu.br.factory.*;
import ibmec.edu.br.observer.*;
public class OrganizadorFinancas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Usuario usuario = new Usuario();
        ResumoFinanceiroObserver observer = new ResumoFinanceiroObserver(usuario);
        usuario.addObserver(observer);

        OperacaoFinanceiraFactory receitaFactory = new ReceitaFactory();
        OperacaoFinanceiraFactory despesaFactory = new DespesaFactory();

        System.out.println("Bem-vindo ao Organizador de Finanças!");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar receita");
            System.out.println("2. Adicionar despesa");
            System.out.println("3. Definir meta financeira");
            System.out.println("4. Exibir resumo financeiro");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor da receita:");
                    double valorReceita = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.println("Digite a descrição da receita:");
                    String descricaoReceita = scanner.nextLine();
                    usuario.adicionarOperacaoFinanceira(receitaFactory.criarOperacao(valorReceita, descricaoReceita));
                    System.out.println("Receita adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o valor da despesa:");
                    double valorDespesa = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.println("Digite a descrição da despesa:");
                    String descricaoDespesa = scanner.nextLine();
                    usuario.adicionarOperacaoFinanceira(despesaFactory.criarOperacao(valorDespesa, descricaoDespesa));
                    System.out.println("Despesa adicionada com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o valor da meta financeira:");
                    double valorMeta = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a nova linha
                    usuario.definirMetaFinanceira(valorMeta);
                    System.out.println("Meta financeira definida com sucesso!");
                    break;
                case 4:
                    System.out.println(usuario.exibirResumoFinanceiro());
                    break;
                case 5:
                    System.out.println("Obrigado por usar o Organizador de Finanças. Até mais!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        }
    }
}