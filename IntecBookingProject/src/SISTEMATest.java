import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by JhonnyBill on 1/18/17.
 */
class SISTEMATest {
    @Test
    void cambiarModalidad() {

        SISTEMA sis = SISTEMA.getInstance();
        boolean bol = sis.getmodalidad();
        sis.cambiarModalidad();
        assertEquals(bol, !sis.getmodalidad());
    }
/*
    @Test
    void cerrarSesion() {

        SISTEMA sis = SISTEMA.getInstance();
        sis.cerrarSesion();
        assertEquals("none", sis.CurrentUsuario().getApellido());
    }
*/
}