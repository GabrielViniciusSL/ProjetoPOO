package ibmec.edu.br.factory;

public interface OperacaoFinanceiraFactory {
    OperacaoFinanceira criarOperacao(double valor, String descricao);
}
