package projeto;

import java.util.Date;

public class Despesa {
    private double valor;
    private Date data;
    private String descricao;
    private Categoria categoria;

    public Despesa(double valor, Date data, String descricao, Categoria categoria) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
