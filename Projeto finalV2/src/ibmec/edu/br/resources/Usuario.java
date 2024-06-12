package ibmec.edu.br.resources;
import java.util.ArrayList;
import java.util.List;

import ibmec.edu.br.factory.OperacaoFinanceira;
import ibmec.edu.br.model.*;
import ibmec.edu.br.observer.*;
public class Usuario extends Observable {
    public List<OperacaoFinanceira> operacoesFinanceiras = new ArrayList<>();
    public double metaFinanceira;

    public void adicionarOperacaoFinanceira(OperacaoFinanceira operacaoFinanceira) {
        operacoesFinanceiras.add(operacaoFinanceira);
        notifyObservers();
    }

    public List<OperacaoFinanceira> getOperacoesFinanceiras() {
        return operacoesFinanceiras;
    }

    public void definirMetaFinanceira(double metaFinanceira) {
        this.metaFinanceira = metaFinanceira;
        notifyObservers();
    }

    public double getMetaFinanceira() {
        return metaFinanceira;
    }

    public String exibirResumoFinanceiro() {
        double totalReceitas = 0;
        double totalDespesas = 0;
        StringBuilder resumo = new StringBuilder("\n--- Resumo Financeiro ---\n");

        for (OperacaoFinanceira operacao : operacoesFinanceiras) {
            if (operacao instanceof Receita) {
                totalReceitas += operacao.getValor();
            } else if (operacao instanceof Despesa) {
                totalDespesas += operacao.getValor();
            }
        }

        resumo.append("Total de Receitas: R$").append(totalReceitas).append("\n");
        resumo.append("Total de Despesas: R$").append(totalDespesas).append("\n");
        resumo.append("Saldo: R$").append(totalReceitas - totalDespesas).append("\n");

        if (metaFinanceira > 0) {
            resumo.append("Meta Financeira: R$").append(metaFinanceira).append("\n");
            if ((totalReceitas - totalDespesas) >= metaFinanceira) {
                resumo.append("Parabéns! Você atingiu sua meta financeira.");
            } else {
                resumo.append("Você ainda não atingiu sua meta financeira.");
            }
        }

        return resumo.toString();
    }
}