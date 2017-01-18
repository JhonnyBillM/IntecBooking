//package Tests;//package Tests;//package Tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by kyonru on 18/01/17.
 */
class SESIONTest {
    @Test
    void logIn() {
        SESION sesion = new SESION(true);
        sesion = sesion.getInstance();
        Usuario usuario = new Usuario();
        assertEquals(sesion, sesion.logIn(usuario));
        assertEquals(sesion.getUsuario(), usuario);
        assertEquals(sesion.isActiva(), true);
    }

    @Test
    void logOut() {
        SESION sesion = new SESION(true);
        sesion = sesion.getInstance();
        Usuario usuario = new Usuario();
        assertEquals(sesion, sesion.logIn(usuario));
        assertEquals(sesion.getUsuario(), usuario);
        assertEquals(sesion.isActiva(), true);
        sesion.logOut();
        //assertEquals(sesion.isActiva(), false);
     //   assertEquals(sesion.getUsuario(), null);
    }

}