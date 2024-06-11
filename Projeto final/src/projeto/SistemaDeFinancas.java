package projeto;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeFinancas extends Sujeito {
    private List<Despesa> despesas = new ArrayList<>();
    private List<Meta> metas = new ArrayList<>();

    public void adicionarDespesa(Despesa despesa) {
        despesas.add(despesa);
        notificarObservadores();
    }

    public void adicionarMeta(Meta meta) {
        metas.add(meta);
        notificarObservadores();
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public List<Meta> getMetas() {
        return metas;
    }
}
