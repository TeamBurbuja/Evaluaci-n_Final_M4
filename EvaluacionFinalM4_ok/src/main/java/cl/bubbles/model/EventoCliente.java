package cl.bubbles.model;
/**
 * Clase que permite crear instancias de listas del objeto cliente
 * @author The bubble
 * @version 4.0
 */
import java.util.List;

public class EventoCliente {

	/**
	 * Atributos de la clase
	 */
	private List<Cliente> clientes;

	/**
	 * Constructor vacío
	 */
	public EventoCliente() {
		super();
	}

	/**
	 * Constructor que recibe parámetros
	 * @param clientes
	 */
	public EventoCliente(List<Cliente> clientes) {
		super();
		this.clientes = clientes;
	}

	/**
	 * Getters and Setters
	 */
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "EventoCliente [clientes=" + clientes + "]";
	}
	
}
