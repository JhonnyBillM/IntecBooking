import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by JhonnyBill on 1/18/17.
 */
class SolicitudTest {



    @Test
    void cambiarEstado() {

        Solicitud sol = new Solicitud();

        estado nuevoEstado = new estado("Rechazada");

        sol.cambiarEstado(nuevoEstado);
        assertEquals(nuevoEstado, sol.getState());


    }

}