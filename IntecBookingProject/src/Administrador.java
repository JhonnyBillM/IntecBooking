public class Administrador extends Usuario {



	private Facilidad[] facilidadesAsignadas;
	private SISTEMA sistema = SISTEMA.getInstance();
	/**
	 *  
	 */
	public void configurarSistema() {
		cambiarModalidad();
	}

	/**
	 *  
	 */
	public void visualizarSolicitudes() {

	}

	/**
	 *  
	 */
	public void modificarSolicitudes() {

	}

	/**
	 *  
	 */
	public void crearFacilidad(Facilidad facilidad){
		sistema.agregarFacilidad(facilidad);
	}

	/**
	 *  
	 */
	public void modificarFacilidad() {

	}

	/**
	 *  
	 */
	public void borrarFacilidad(Facilidad facilidad) {
		sistema.BorrarFacilidad(facilidad.facilidadID);
	}

	/**
	 *  
	 */
	public void cambiarModalidad() {
		sistema.cambiarModalidad();
	}

}
