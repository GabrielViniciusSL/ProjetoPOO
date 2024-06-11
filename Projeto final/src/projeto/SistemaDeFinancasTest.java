package projeto;

import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SistemaDeFinancasTest {

    @Test
    public void testAdicionarDespesa() {
        SistemaDeFinancas sistema = new SistemaDeFinancas();
        Categoria categoria = new Categoria("Alimentação");
        Despesa despesa = new Despesa(50.0, new Date(), "Jantar", categoria);

        sistema.adicionarDespesa(despesa);

        assertEquals(1, sistema.getDespesas().size());
        assertEquals(despesa, sistema.getDespesas().get(0));
    }

    @Test
    public void testAdicionarMeta() {
        SistemaDeFinancas sistema = new SistemaDeFinancas();
        Meta meta = new Meta(500.0, new Date());

        sistema.adicionarMeta(meta);

        assertEquals(1, sistema.getMetas().size());
        assertEquals(meta, sistema.getMetas().get(0));
    }
}
