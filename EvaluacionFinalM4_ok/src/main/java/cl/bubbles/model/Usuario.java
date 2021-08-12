package cl.bubbles.model;
/**
 * Clase que permite crear instancias del objeto usuario
 * @author The bubble
 * @version 4.0
 */
public class Usuario {
	/**
	 * Atributos de la clase
	 */
	private int id;
	private String nombre;
	private String fechaNacimiento;
	private String run;
	private String tipoUsuario;
	
	/**
	 * Constructor vacío 
	 */
	public Usuario() {
		
	}

	/**
	 * Constructor que recibe parámetros
	 * @param id
	 * @param nombre
	 * @param fechaNacimiento
	 * @param run
	 * @param tipoUsuario
	 */
	public Usuario(int id, String nombre, String fechaNacimiento, String run, String tipoUsuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
		this.tipoUsuario = tipoUsuario;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run
				+ ", tipoUsuario=" + tipoUsuario + "]";
	}
	
}
