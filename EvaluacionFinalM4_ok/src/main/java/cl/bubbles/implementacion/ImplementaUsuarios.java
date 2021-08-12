package cl.bubbles.implementacion;
/**
 * Clase que implementa los métodos de la interface IUsuario
 * @author The bubble
 * @version 4.0
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import cl.bubbles.conexion.Conexion;
import cl.bubbles.interfaces.IUsuario;
import cl.bubbles.model.Administrativo;
import cl.bubbles.model.Cliente;
import cl.bubbles.model.EventoUsuario;
import cl.bubbles.model.Profesional;
import cl.bubbles.model.Usuario;

public class ImplementaUsuarios implements IUsuario {

	@Override
	public List<Usuario> leerUsuario() {
		// TODO Auto-generated method stub
		List<Usuario> lista = new ArrayList<Usuario>();
		
		try {
			
			Connection cn = Conexion.getInstance();
			Statement s = cn.createStatement();
			
			String sql = "SELECT id_usuario, usunombre, usufechanac, usurun, usutipo FROM usuario";
			
			ResultSet rs = s.executeQuery(sql);
			
			while (rs.next()) {
				lista.add(new Usuario(rs.getInt("id_usuario"), rs.getString("usunombre"),
						rs.getString("usufechanac"), rs.getString("usurun"),
						rs.getString("usutipo")));
			}
			
		} catch (SQLException e) {
			
			System.out.println("Error de SQLException");
			e.printStackTrace();
			
		}
		
		return lista;
	}

	@Override
	public void crearUsuario(Usuario u) {
		
		String sql = "INSERT INTO usuario VALUES ("+ u.getId() +",'"+ u.getNombre()
			+"','"+ u.getFechaNacimiento() +"','"+ u.getRun() +"','"+ u.getTipoUsuario() +"')";
		
		try {
			
			Connection cn = Conexion.getInstance();
			Statement s = cn.createStatement();
			
			s.executeQuery(sql);
			
		} catch (SQLException e) {
			
			System.out.println("Error en crear usuario");
			e.printStackTrace();
			
		}
		
	}

	@Override
	public List<Usuario> registrarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		List<Usuario> lista = new ArrayList<Usuario>();
		
		lista.add(u);
		
		return lista;
	}

	@Override
	public void crearAdministrativo(Administrativo a) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO administrativo VALUES ("+ a.getId()
		+",'"+ a.getNombreSuperior() +"','"+ a.getArea() +"','"+ a.getFuncion()
		+"','"+ a.getExperienciaPrevia() +"')";
		
		try {
			
			Connection cn = Conexion.getInstance();
			Statement s = cn.createStatement();
			
			s.executeQuery(sql);
			
		} catch (SQLException e) {
			
			System.out.println("Error en crear administrativo");
			e.printStackTrace();
			
		}
		
	}

	@Override
	public List<Administrativo> registrarAdministrativo(Administrativo a) {
		
		List<Administrativo> lista = new ArrayList<Administrativo>();
		
		lista.add(a);
		
		return lista;
	}

	@Override
	public void crearCliente(Cliente c) {

		String sql = "INSERT INTO cliente VALUES ('"+ c.getRutEmpresa()
			+"','"+ c.getRazonSocial() +"','"+ c.getDireccion() +"','"+ c.getComuna()
			+"','"+ c.getCantidadEmpleados() +"','"+ c.getTelefono() +"')";
		
		try {
			
			Connection cn = Conexion.getInstance();
			Statement s = cn.createStatement();
			s.executeQuery(sql);
			
		} catch (SQLException e) {
			
			System.out.println("Error en crear cliente");
			e.printStackTrace();
			
		}
		
	}

	@Override
	public List<Cliente> registrarCliente(Cliente c) {
		
		List<Cliente> lista = new ArrayList<Cliente>();
		
		lista.add(c);
		
		return lista;
	}

	@Override
	public void crearProfesional(Profesional p) {
		
		String sql = "INSERT INTO profesional VALUES ("+ p.getId() +","+ p.getAniosExperiencia()
			+",'"+ p.getDepartamento() +"','"+ p.getTitulo() +"','"+ p.getFechaIngreso() +"')";
		
		try {
			
			Connection cn = Conexion.getInstance();
			Statement s = cn.createStatement();
			s.executeQuery(sql);
			
		} catch (SQLException e) {
			
			System.out.println("Error en crear profesional");
			e.printStackTrace();
			
		}
		
	}

	@Override
	public List<Profesional> registrarProfesional(Profesional p) {
		
		List<Profesional> lista = new ArrayList<Profesional>();
		
		lista.add(p);
		
		return lista;
	}

	@Override
	public List<Administrativo> leerAdministrativo() {
		
		List<Administrativo> lista = new ArrayList<Administrativo>();
		
		try {
			
			Connection cn = Conexion.getInstance();
			Statement s = cn.createStatement();
			
			String sql = "SELECT id_admin, admsuperior, admarea, admexperiencia, admfuncion FROM administrativo";
			
			ResultSet rs = s.executeQuery(sql);
			
			while (rs.next()) {
				lista.add(new Administrativo(rs.getInt("id_admin"), rs.getString("admsuperior"),
						rs.getString("admarea"), rs.getString("admexperiencia"),
						rs.getString("admfuncion")));
			}
			
		} catch (SQLException e) {
			
			System.out.println("Error de SQLException");
			e.printStackTrace();
			
		}
		
		return lista;
	}

	@Override
	public List<Cliente> leerCliente() {

		List<Cliente> lista = new ArrayList<Cliente>();
		
		try {
			
			Connection cn = Conexion.getInstance();
			Statement s = cn.createStatement();
			
			String sql = "SELECT rutempresa, clirazon, clidireccion, clicomuna, "
					+ "cliempleados, clitelefono FROM cliente;";
			
			ResultSet rs = s.executeQuery(sql);
			
			while (rs.next()) {
				lista.add(new Cliente(rs.getString("rutempresa"), rs.getString("clirazon"),
						rs.getString("clidireccion"), rs.getString("clicomuna"),
						rs.getInt("cliempleados"), rs.getString("clitelefono")));
			}
			
		} catch (SQLException e) {
			
			System.out.println("Error de SQLException");
			e.printStackTrace();
			
		}
		
		return lista;
	}

	@Override
	public List<Profesional> leerProfesional() {
		
		List<Profesional> lista = new ArrayList<Profesional>();
		
		try {
			
			Connection cn = Conexion.getInstance();
			Statement s = cn.createStatement();
			
			String sql = "SELECT id_profesional, proexperiencia, prodepto, "
					+ "protitulo, profecha FROM profesional";
			
			ResultSet rs = s.executeQuery(sql);
			
			while (rs.next()) {
				lista.add(new Profesional(rs.getInt("id_profesional"), rs.getInt("proexperiencia"),
						rs.getString("prodepto"), rs.getString("protitulo"),
						rs.getString("profecha")));
			}
			
		} catch (SQLException e) {

			System.out.println("Error de SQLException");
			e.printStackTrace();
		
		}
		
		return null;
	}

	@Override
	public Usuario buscarUsuario(String run) {
		
		ImplementaUsuarios iu = new ImplementaUsuarios();
		EventoUsuario eu = new EventoUsuario();
		eu.setUsuarios(iu.leerUsuario());
		
		Usuario esteEs = null;
		
		for (Usuario u : eu.getUsuarios()) {
			if (u.getRun().equals(run)) {
				esteEs = u;
			}
		}
		
		return esteEs;
	}

	@Override
	public void actualizarUsuario(Usuario u) {
		
		String sql = "UPDATE  usuario SET usunombre = '"+ u.getNombre()
				+"', usufechanac = '"+ u.getFechaNacimiento() +"',"
				+ "usurun = '"+ u.getRun() +"', usutipo = '"+ u.getTipoUsuario()
				+"' WHERE usurun = '"+ u.getRun() +"'";
		
		try {
			
			Connection cn = Conexion.getInstance();
			Statement s = cn.createStatement();
			
			cn.setAutoCommit(true);
			
			s.executeQuery(sql);
			
			s.close();
			
			
			
			
		} catch (SQLException e) {
			
			System.out.println("Error en actualizar usuario");
			e.printStackTrace();
			
		}
		
	}

}









