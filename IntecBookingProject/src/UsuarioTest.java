//package Tests;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by JhonnyBill on 1/18/17.
 */
class UsuarioTest {




    @Test
    void crearSolicitud() {

        int id = 10, userId = 5;


        Date actualDate = new Date();
        fecha_hora dateRequeried = new fecha_hora(actualDate);
        fecha_hora systemActualDate = new fecha_hora(actualDate);
        estado est = new estado("Espera");

        Solicitud s = new Solicitud(id, userId, systemActualDate, est);

        SISTEMA sis = SISTEMA.getInstance();


        assertEquals(sis.solicitudExists(id), true);

    }

    @Test
    void auth() {

    }

    @Test
    void modificarSolicitudPropia() {
        Usuario u = new Usuario(1, "k", "Taiga", "Kagami");

    }
    /*Really?*/
    @Test
    void visualizarSolicitudPropia() {

    }

    /*?*/
    @Test
    void consultarFacilidad() {

    }



    @Test
    void buscarFacilidad() {
        Usuario user = new Usuario(1,"k","Taiga","Kagami");

        assertEquals(user.buscarFacilidad(12),true);

    }

}