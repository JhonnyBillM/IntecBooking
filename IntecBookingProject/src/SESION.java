public class SESION {


	private static SESION ourInstance = new SESION();

	public static SESION getInstance() {
		return ourInstance;
	}

	private SESION() {
		usuario = null;
		activa = false;
	}

	public SESION(boolean flag){
		getInstance();
	}
	private Usuario usuario;

	private boolean activa;

	public SESION logIn(Usuario Usuario) {
		this.ourInstance.usuario = Usuario;
		this.ourInstance.activa = true;
		return getInstance();
	}

	public SESION logOut() {
		this.ourInstance.usuario = null;
		this.ourInstance.activa = false;
		return getInstance();
	}

	public Usuario getUsuario(){
		if(usuario == null){
			return new Usuario();
		}
		return this.usuario;
	}

	public boolean isActiva(){
		return this.activa;
	}

}
