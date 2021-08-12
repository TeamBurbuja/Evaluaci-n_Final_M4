package cl.bubbles.model;
/**
 * Clase que permite crear instancias del objeto sesión
 * @author The bubble
 * @version 4.0
 */
public class Sesion {
	/**
	 * Atributos de la clase
	 */
	private String usuario;
	private String password;
	
	/**
	 * Constructor vacío
	 */
	public Sesion() {
		
	}

	/**
	 * Constructor que recibe parámetros
	 * @param usuario
	 * @param password
	 */
	public Sesion(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	}

	/**
	 * Getters and Setters
	 */
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Sesion [usuario=" + usuario + ", password=" + password + "]";
	}
	
}
