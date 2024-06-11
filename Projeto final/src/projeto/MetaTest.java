package projeto;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MetaTest {

    @Test
    public void testGetters() {
        Meta meta = new Meta(500.0, new Date());

        assertEquals(500.0, meta.getValorMeta(), 0);
    }
}
