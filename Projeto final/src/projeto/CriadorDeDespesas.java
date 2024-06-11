package projeto;

import java.util.Date;

public abstract class CriadorDeDespesas {
    public abstract Despesa criarDespesa(double valor, Date data, String descricao, Categoria categoria);
}
