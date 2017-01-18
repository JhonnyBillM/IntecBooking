public class Solicitud {

	public int idsolicitud;

	private int idadministrador;

	private fecha_hora fechahorasolicitada;

	private int idusuario;

	private estado estado;




	public Solicitud(){

		//Crear solicitud con el private Solicitud


	}

	public Solicitud(int id, int user, fecha_hora date, estado estate){

		this.idsolicitud = id;
		this.fechahorasolicitada = date;
		cambiarEstado(estate);
	}


	/**
	 *  
	 */
	public void cambiarEstado(estado st) {

		this.estado = st;

	}
	public estado getState(){
		return this.estado;
	}

	public int getSolicitanteID(){return this.idusuario;}

}
