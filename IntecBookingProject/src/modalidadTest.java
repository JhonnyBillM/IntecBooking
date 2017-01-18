import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by kyonru on 18/01/17.
 */
class modalidadTest {
    @Test
    void cambiarModalidad() {
        modalidad mod = new modalidad();
        boolean moda = mod.getModalidad();
        mod.cambiarModalidad();
        assertEquals(moda, !mod.getModalidad());
    }

}