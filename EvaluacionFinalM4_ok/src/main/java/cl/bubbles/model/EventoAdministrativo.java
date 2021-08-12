package cl.bubbles.model;
/**
 * Clase que permite crear instancias de listas del objeto administrativo
 * @author The bubble
 * @version 4.0
 */
import java.util.List;

public class EventoAdministrativo {
	/**
	 * Atributos de la clase
	 */
	private List<Administrativo> administrativos;

	/**
	 * Constructor vacío
	 */
	public EventoAdministrativo() {
		super();
	}

	/**
	 * Constructor que recibe parámetros
	 * @param administrativos
	 */
	public EventoAdministrativo(List<Administrativo> administrativos) {
		super();
		this.administrativos = administrativos;
	}

	/**
	 * Getters and Setters
	 */
	public List<Administrativo> getAdministrativos() {
		return administrativos;
	}

	public void setAdministrativos(List<Administrativo> administrativos) {
		this.administrativos = administrativos;
	}

	@Override
	public String toString() {
		return "EventoAdministrativo [administrativos=" + administrativos + "]";
	}
	
}
