package cl.bubbles.model;
/**
 * Clase que permite crear instancias de listas del objeto capacitación
 * @author The bubble
 * @version 4.0
 */
import java.util.List;

public class EventoCapacitacion {
	/**
	 * Atributos de la clase
	 */
	private List<Capacitacion> capacitaciones;

	/**
	 * Constructor vacío
	 */
	public EventoCapacitacion() {
		
	}

	/**
	 * Constructor que recibe parámetros
	 * @param capacitaciones
	 */
	public EventoCapacitacion(List<Capacitacion> capacitaciones) {
		super();
		this.capacitaciones = capacitaciones;
	}

	/**
	 * Getters and Setters
	 */
	public List<Capacitacion> getCapacitaciones() {
		return capacitaciones;
	}

	public void setCapacitaciones(List<Capacitacion> capacitaciones) {
		this.capacitaciones = capacitaciones;
	}

	@Override
	public String toString() {
		return "EventoCapacitacion [capacitaciones=" + capacitaciones + "]";
	}
	
}
