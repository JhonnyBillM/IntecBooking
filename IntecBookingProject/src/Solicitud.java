public class Solicitud {

	private int idsolicitud;

	private int idadministrador;

	private fecha_hora fechahorasolicitada;

	private int idusuario;

	private estado estado;

	public Solicitud(){

	}

	public Solicitud(int id, fecha_hora date, int user, estado estate){

		this.idsolicitud = id;
		this.fechahorasolicitada = date;
		this.estado = estate;

	}
	/**
	 *  
	 */
	public void cambiarEstado() {

	}

}
