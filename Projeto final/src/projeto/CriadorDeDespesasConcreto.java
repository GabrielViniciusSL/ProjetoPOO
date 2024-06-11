package projeto;

import java.util.Date;

public class CriadorDeDespesasConcreto extends CriadorDeDespesas {
    @Override
    public Despesa criarDespesa(double valor, Date data, String descricao, Categoria categoria) {
        return new DespesaConcreta(valor, data, descricao, categoria);
    }
}
