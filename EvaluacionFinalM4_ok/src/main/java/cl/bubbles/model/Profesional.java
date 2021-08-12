package cl.bubbles.model;
/**
 * Clase que permite crear instancias del objeto profesional
 * @author The bubble
 * @version 4.0
 */
public class Profesional {
	/**
	 * Atributos de la clase
	 */
	private int id;
	private int aniosExperiencia;
	private String departamento;
	private String titulo;
	private String fechaIngreso;
	
	/**
	 * Constructor vacío
	 */
	public Profesional() {
		
	}

	/**
	 * Constructor que recibe parámetros
	 * @param id
	 * @param aniosExperiencia
	 * @param departamento
	 * @param titulo
	 * @param fechaIngreso
	 */
	public Profesional(int id, int aniosExperiencia, String departamento, String titulo, String fechaIngreso) {
		super();
		this.id = id;
		this.aniosExperiencia = aniosExperiencia;
		this.departamento = departamento;
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * Getters and Setters
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Profesional [id=" + id + ", aniosExperiencia=" + aniosExperiencia + ", departamento=" + departamento
				+ ", titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
}
