package cl.bubbles.conexion;
/**
 * Clase que permite crear instancias del objeto Conexion
 * @author The bubble
 * @version 4.0
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static Connection con = null;
	
	private Conexion() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "MVC", "15480130");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getInstance() {
		if (con == null) {
			new Conexion();
		}
		return con;
	}
	
}
