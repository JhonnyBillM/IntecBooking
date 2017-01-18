import java.util.Base64;
import java.util.LinkedList;
import java.util.List;

public class SISTEMA {

	private modalidad modalidad;
	private Administrador[] administradores;
	private SESION sESION;


	private static SISTEMA ourInstance = new SISTEMA();
	public static SISTEMA getInstance() {
		return ourInstance;
	}



	private SISTEMA() {
		this.modalidad = new modalidad();
		//Cargar admins
		//Cargar listas

	}


	//Lista de facilidades
	List<Facilidad> facilidadesList;

	//Lista de solicitudes
	List<Solicitud> solicitudesList;



	public SISTEMA cambiarModalidad() {
		return null;
	}

	public void cerrarSesion() {

	}

	Boolean solicitudExists(int id){

		SISTEMA sis = SISTEMA.getInstance();

		for (Solicitud soli: sis.solicitudesList) {

			if(soli.idsolicitud == id){
				return true;
			}

		}
		return false;
	}



}
