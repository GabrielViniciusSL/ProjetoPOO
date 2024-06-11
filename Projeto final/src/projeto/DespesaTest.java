package projeto;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DespesaTest {

    @Test
    public void testGetters() {
        Categoria categoria = new Categoria("Alimentação");
        Despesa despesa = new Despesa(50.0, new Date(), "Jantar", categoria);

        assertEquals(50.0, despesa.getValor(), 0);
        assertEquals("Jantar", despesa.getDescricao());
        assertEquals(categoria, despesa.getCategoria());
    }
}
