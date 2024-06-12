package ibmec.edu.br.model;
import ibmec.edu.br.factory.*;
public class Despesa implements OperacaoFinanceira {
    private String descricao;
    private double valor;

    public Despesa(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }



	// Getters e setters
    @Override
    public double getValor() {
        return valor;
    }
	@Override
    public String getDescricao() {
        return descricao;
    }

}
