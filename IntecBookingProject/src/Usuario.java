public class Usuario {

	private int idusuario;

	private String contraseña;

	private String nombre;

	private String apellido;


	public Usuario(){

	}

	public Usuario(int id, String pwd, String name, String apellido){
		this.idusuario = id;
		this.contraseña = pwd;
		this.nombre = name;
		this.apellido = apellido;

	}

	public void crearSolicitud(int solId, int userID, fecha_hora fechaSolicitada, int tiempoSolicitud, fecha_hora fechaSolicitud) {

	}

	public void auth() {

	}

	/**
	 *  
	 */
	public void modificarSolicitudPropia(int solId, fecha_hora newFecha) {

	}

	/**
	 *  
	 */
	public void visualizarSolicitudPropia() {

	}

	/**
	 *  
	 */
	public void consultarFacilidad() {

	}
	/**
	 *
	 *
	 */
	public Solicitud obtenerSolicitudPropia(int userId, int solicitudId){
		SISTEMA sis = SISTEMA.getInstance();

		for (Solicitud soli: sis.solicitudesList) {

			if(soli.idsolicitud == solicitudId && soli.getSolicitanteID() == userId){
				return soli;
			}

		}
		return null;

	}
	/**
	 *  
	 */
	public boolean buscarFacilidad(int id) {

			SISTEMA sis = SISTEMA.getInstance();

			for (Solicitud soli: sis.solicitudesList) {

				if(soli.idsolicitud == id){
					return true;
				}

			}
			return false;
		}
	public int getIdusuario(){return this.idusuario;}


}
