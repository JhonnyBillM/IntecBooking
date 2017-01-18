import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by kyonru on 18/01/17.
 */
class AdministradorTest {

    Facilidad facilidad = new Facilidad("prueba");
    @Test
    void configurarSistema() {

        SISTEMA sistema = SISTEMA.getInstance();
        Administrador adm = new Administrador();
        boolean modalida = sistema.getmodalidad();
        adm.configurarSistema();
        assertEquals(modalida, !sistema.getmodalidad());
    }

    @Test
    void modificarSolicitudes() {

    }

    @Test
    void crearFacilidad() {
        SISTEMA sistema = SISTEMA.getInstance();
        Administrador adm = new Administrador();
        int cnt = sistema.facilidadesList.size();
        adm.crearFacilidad(facilidad);
        assertEquals(cnt+1, sistema.facilidadesList.size());
    }

    @Test
    void modificarFacilidad() {

    }

    @Test
    void borrarFacilidad() {
        SISTEMA sistema = SISTEMA.getInstance();
        Administrador adm = new Administrador();
        int cnt = sistema.facilidadesList.size();
        adm.borrarFacilidad(facilidad);
        assertEquals(cnt-1, sistema.facilidadesList.size());
    }

    @Test
    void cambiarModalidad() {
        SISTEMA sistema = SISTEMA.getInstance();
        Administrador adm = new Administrador();
        boolean modalida = sistema.getmodalidad();
        adm.cambiarModalidad();
        assertEquals(modalida, !sistema.getmodalidad());

    }

}