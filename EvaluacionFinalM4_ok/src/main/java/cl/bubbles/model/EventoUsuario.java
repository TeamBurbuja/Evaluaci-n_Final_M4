package cl.bubbles.model;
/**
 * Clase que permite crear instancias de listas del objeto usuario
 * @author The bubble
 * @version 4.0
 */
import java.util.List;

public class EventoUsuario {
	/**
	 * Atributos de la clase
	 */
	private List<Usuario> usuarios;

	/**
	 * Constructor vacío
	 */
	public EventoUsuario() {
		super();
	}

	/**
	 * Constructor que recibe parámetros
	 * @param usuarios
	 */
	public EventoUsuario(List<Usuario> usuarios) {
		super();
		this.usuarios = usuarios;
	}

	/**
	 * Getters and Setters
	 */
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return "EventoUsuario [usuarios=" + usuarios + "]";
	}
	
}
