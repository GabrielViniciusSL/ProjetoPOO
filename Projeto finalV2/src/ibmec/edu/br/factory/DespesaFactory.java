package ibmec.edu.br.factory;
import ibmec.edu.br.model.*;
public class DespesaFactory implements OperacaoFinanceiraFactory {
    @Override
    public OperacaoFinanceira criarOperacao(double valor, String descricao) {
    	return new Despesa(descricao, valor);
    	
    }
}
