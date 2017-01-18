import java.util.ArrayList;

public class SISTEMA {

	private modalidad modalidad;
	private Administrador[] administradores;
	private SESION sESION;


	private static SISTEMA ourInstance = new SISTEMA();
	public static SISTEMA getInstance() {
		return ourInstance;
	}


	public boolean getmodalidad(){
		return modalidad.getModalidad();
	}

	private SISTEMA() {
		this.modalidad = new modalidad();
		//Cargar admins
		//Cargar listas
	}

	public void BorrarFacilidad(String id){

		facilidadesList.remove(buscarFacilidad(id));
	}

	public Facilidad buscarFacilidad(String id){
		for (Facilidad soli: facilidadesList) {
			if(soli.getFacilidadID().equals(id)){
				return soli;
			}
		}
		return null;
	}


	//Lista de facilidades
	ArrayList<Facilidad> facilidadesList = new ArrayList<Facilidad>();


	//Lista de solicitudes
	ArrayList<Solicitud> solicitudesList = new ArrayList<Solicitud>();

	public void cambiarModalidad() {
		modalidad.cambiarModalidad();
	}
	public void cerrarSesion() {
		sESION.logOut();
	}
	public void agregarFacilidad(Facilidad facilidad){
		facilidadesList.add(facilidad);
	}
	public void agregarSolicitud(Solicitud solicitud){
		solicitudesList.add(solicitud);
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


	public Usuario CurrentUsuario(){

		if(this.sESION.getUsuario() == null){
			return null;
		}
		return this.sESION.getUsuario();
	}
}
