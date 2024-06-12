package ibmec.edu.br.model;
import ibmec.edu.br.factory.*;
public class Receita implements OperacaoFinanceira {
	private String descricao;
	private double valor;
    


    public Receita(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
