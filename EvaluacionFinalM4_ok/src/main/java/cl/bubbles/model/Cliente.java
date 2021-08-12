package cl.bubbles.model;
/**
 * Clase que permite crear instancias del objeto cliente
 * @author The bubble
 * @version 4.0
 */
public class Cliente {
	/**
	 * Atributos de la clase
	 */
	private String rutEmpresa;
	private String razonSocial;
	private String direccion;
	private String comuna;
	private int cantidadEmpleados;
	private String telefono;
	
	/**
	 * Constructor vacío 
	 */
	public Cliente() {
		
	}

	/**
	 * Constructor que recibe parámetros
	 * @param rutEmpresa
	 * @param razonSocial
	 * @param direccion
	 * @param comuna
	 * @param cantidadEmpleados
	 * @param telefono
	 */
	public Cliente(String rutEmpresa, String razonSocial, String direccion, String comuna, int cantidadEmpleados,
			String telefono) {
		super();
		this.rutEmpresa = rutEmpresa;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.comuna = comuna;
		this.cantidadEmpleados = cantidadEmpleados;
		this.telefono = telefono;
	}

	/**
	 * Getters and Setters
	 */
	public String getRutEmpresa() {
		return rutEmpresa;
	}

	public void setRutEmpresa(String rutEmpresa) {
		this.rutEmpresa = rutEmpresa;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}

	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [rutEmpresa=" + rutEmpresa + ", razonSocial=" + razonSocial + ", direccion=" + direccion
				+ ", comuna=" + comuna + ", cantidadEmpleados=" + cantidadEmpleados + ", telefono=" + telefono + "]";
	}
	
}
