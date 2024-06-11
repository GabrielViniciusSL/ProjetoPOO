package projeto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CategoriaTest {

    @Test
    public void testGetNome() {
        Categoria categoria = new Categoria("Alimentação");
        assertEquals("Alimentação", categoria.getNome());
    }
}
