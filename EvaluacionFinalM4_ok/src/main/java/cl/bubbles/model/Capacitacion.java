package cl.bubbles.model;
/**
 * Clase que permite crear instancias del objeto capacitación
 * @author The bubble
 * @version 4.0
 */

public class Capacitacion {
	/**
	 * Atributos de la clase
	 */
	private int idCapacitacion;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private int duracion;
	private int cantidadAsistentes;
	
	/**
	 * Constructor vacío
	 */
	public Capacitacion() {
		
	}

	/**
	 * Constructor que recibe parámetros
	 * @param idCapacitacion
	 * @param rutCliente
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param duracion
	 * @param cantidadAsistentes
	 */
	public Capacitacion(int idCapacitacion, String rutCliente, String dia, String hora, String lugar, int duracion,
			int cantidadAsistentes) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	/**
	 * Getters and Setters
	 */
	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
				+ cantidadAsistentes + "]\n";
	}
	
}
