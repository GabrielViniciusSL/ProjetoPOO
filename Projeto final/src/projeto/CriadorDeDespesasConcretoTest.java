package projeto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Date;

public class CriadorDeDespesasConcretoTest {

    @Test
    public void testCriarDespesa() {
        Categoria categoria = new Categoria("Alimentação");
        CriadorDeDespesas criador = new CriadorDeDespesasConcreto();
        Despesa despesa = criador.criarDespesa(50.0, new Date(), "Jantar", categoria);

        assertTrue(despesa instanceof DespesaConcreta);
    }
}
