package ibmec.edu.br.factory;
import ibmec.edu.br.model.*;
public class ReceitaFactory implements OperacaoFinanceiraFactory {
    @Override
    public OperacaoFinanceira criarOperacao(double valor, String descricao) {
        return new Receita(valor, descricao);
    }
}
