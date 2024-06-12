package ibmec.edu.br.test;

import ibmec.edu.br.factory.*;
import ibmec.edu.br.resources.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OrganizadorFinancasTest {

	@Test
    public void testAdicionarReceita() {
        Usuario usuario = new Usuario();
        OperacaoFinanceiraFactory receitaFactory = new ReceitaFactory();
        
        usuario.adicionarOperacaoFinanceira(receitaFactory.criarOperacao(100, "Salário"));

        assertEquals(1, usuario.getOperacoesFinanceiras().size());
        assertEquals(100, usuario.getOperacoesFinanceiras().get(0).getValor(), 0.001);
        assertEquals("Salário", usuario.getOperacoesFinanceiras().get(0).getDescricao());
    }

    @Test
    public void testAdicionarDespesa() {
        Usuario usuario = new Usuario();
        OperacaoFinanceiraFactory despesaFactory = new DespesaFactory();
        
        usuario.adicionarOperacaoFinanceira(despesaFactory.criarOperacao(50, "Alimentação"));

        assertEquals(1, usuario.getOperacoesFinanceiras().size());
        assertEquals(50, usuario.getOperacoesFinanceiras().get(0).getValor(), 0.001);
        assertEquals("Alimentação", usuario.getOperacoesFinanceiras().get(0).getDescricao());
    }

    @Test
    public void testExibirResumoFinanceiro() {
        Usuario usuario = new Usuario();
        OperacaoFinanceiraFactory receitaFactory = new ReceitaFactory();
        OperacaoFinanceiraFactory despesaFactory = new DespesaFactory();
        
        usuario.adicionarOperacaoFinanceira(receitaFactory.criarOperacao(1000, "Salário"));
        usuario.adicionarOperacaoFinanceira(despesaFactory.criarOperacao(200, "Aluguel"));
        usuario.adicionarOperacaoFinanceira(despesaFactory.criarOperacao(50, "Alimentação"));

        String resumoEsperado = "\n--- Resumo Financeiro ---\n" +
                                "Total de Receitas: R$1000.0\n" +
                                "Total de Despesas: R$250.0\n" +
                                "Saldo: R$750.0\n";
        
        assertEquals(resumoEsperado, usuario.exibirResumoFinanceiro());
    }

    @Test
    public void testDefinirMetaFinanceira() {
        Usuario usuario = new Usuario();
        
        usuario.definirMetaFinanceira(500);

        assertEquals(500, usuario.getMetaFinanceira(), 0.001);
    }

    @Test
    public void testAtingirMetaFinanceira() {
        Usuario usuario = new Usuario();
        OperacaoFinanceiraFactory receitaFactory = new ReceitaFactory();
        
        usuario.definirMetaFinanceira(500);
        usuario.adicionarOperacaoFinanceira(receitaFactory.criarOperacao(600, "Bônus"));

        String resumo = usuario.exibirResumoFinanceiro();
        assertTrue(resumo.contains("Parabéns! Você atingiu sua meta financeira."));
    }
}