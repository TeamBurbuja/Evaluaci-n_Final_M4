package cl.bubbles.implementacion;
/**
 * Clase que implementa los métodos de la interface ICapacitacion
 * @author The bubble
 * @version 4.0
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.bubbles.conexion.Conexion;
import cl.bubbles.interfaces.ICapacitacion;
import cl.bubbles.model.Capacitacion;
import cl.bubbles.model.EventoCapacitacion;

public class ImplementaCapacitacion implements ICapacitacion {

	@Override
	public EventoCapacitacion leerCapacitacion() {
		
		EventoCapacitacion ec = new EventoCapacitacion();

		List<Capacitacion> lista = new ArrayList<Capacitacion>();

		lista.add(new Capacitacion(1, "771111111", "Martes", "12:15", "Santiago", 90, 25));
		lista.add(new Capacitacion(2, "772222222", "Viernes", "10:30", "Providencia", 60, 12));
		lista.add(new Capacitacion(3, "773333333", "Martes", "14:00", "Quilicura", 45, 14));
		lista.add(new Capacitacion(4, "774444444", "Jueves", "09:15", "Las Condes", 25, 5));
		lista.add(new Capacitacion(5, "775555555", "Lunes", "17:00", "Macul", 90, 18));
		lista.add(new Capacitacion(6, "776666666", "Martes", "13:00", "La Florida", 120, 22));
		lista.add(new Capacitacion(7, "777777777", "Jueves", "11:00", "Ñuñoa", 45, 30));
		lista.add(new Capacitacion(8, "778888888", "Viernes", "12:30", "El Bosque", 60, 8));
		lista.add(new Capacitacion(9, "779999999", "Miércoles", "15:45", "Maipú", 120, 20));
		lista.add(new Capacitacion(10, "770000000", "Lunes", "09:45", "Vitacura", 180, 30));

		ec.setCapacitaciones(lista);

		return ec;
	}

	@Override
	public List<Capacitacion> registrarCapacitacion(Capacitacion c) {
		
		  List<Capacitacion> lista = new ArrayList<Capacitacion>();
		  
		  lista.add(c);
		  
		  return lista;
		 
	}

	@Override
	public void crearCapacitacion(Capacitacion c) {
		
		String sql = "INSERT INTO capacitacion VALUES (" + c.getIdCapacitacion()
		+ ", '" + c.getRutCliente() + "', '" + c.getDia() + "', '" + c.getHora()
		+ "', '" + c.getLugar() + "', " + c.getDuracion() + ", " + c.getCantidadAsistentes() + ")";
		
		try {
			
			Connection cn = Conexion.getInstance();
			Statement s = cn.createStatement();
			s.executeQuery(sql);
			
		} catch (SQLException e) {
			
			System.out.println("Error en crear capacitación");
			e.printStackTrace();
			
		}
		
	}

	@Override
	public List<Capacitacion> leerTodo() {
		
		List<Capacitacion> lista = new ArrayList<Capacitacion>();
		
		try {
			
			Connection cn = Conexion.getInstance();
			Statement s = cn.createStatement();
			
			String sql = "SELECT id_capacitacion, rut_cliente, capdia, caphora, caplugar, capduracion, capasistentes FROM capacitacion";
			
			ResultSet rs = s.executeQuery(sql);
			
			while (rs.next()) {
				lista.add(new Capacitacion(rs.getInt("id_capacitacion"),
					rs.getString("rut_cliente"), rs.getString("capdia"),
					rs.getString("caphora"), rs.getString("caplugar"),
					rs.getInt("capduracion"), rs.getInt("capasistentes")));
			}
			
		} catch (SQLException e) {
			
			System.out.println("Error de SQLException");
			e.printStackTrace();
			
		}
		
		return lista;
	}

}
