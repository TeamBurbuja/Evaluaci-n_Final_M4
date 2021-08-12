package cl.bubbles.model;
/**
 * Clase que permite crear instancias del objeto administrativo
 * @author The bubble
 * @version 4.0
 */
public class Administrativo {
	/**
	 * Atributos de la clase
	 */
	private int id;
	private String nombreSuperior;
	private String area;
	private String experienciaPrevia;
	private String funcion;
	
	/**
	 * Constructor vacío
	 */
	public Administrativo() {
		
	}

	/**
	 * Constructor que recibe parámetros
	 * @param id
	 * @param nombreSuperior
	 * @param area
	 * @param experienciaPrevia
	 * @param funcion
	 */
	public Administrativo(int id, String nombreSuperior, String area, String experienciaPrevia, String funcion) {
		super();
		this.id = id;
		this.nombreSuperior = nombreSuperior;
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
		this.funcion = funcion;
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

	public String getNombreSuperior() {
		return nombreSuperior;
	}

	public void setNombreSuperior(String nombreSuperior) {
		this.nombreSuperior = nombreSuperior;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	@Override
	public String toString() {
		return "Administrativo [id=" + id + ", nombreSuperior=" + nombreSuperior + ", area=" + area
				+ ", experienciaPrevia=" + experienciaPrevia + ", funcion=" + funcion + "]";
	}
	
}
