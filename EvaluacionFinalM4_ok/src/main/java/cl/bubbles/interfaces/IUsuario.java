package cl.bubbles.interfaces;
/**
 * Interface que permite definir los métodos a implementar
 * para los diferentes objetos de tipo usuarios
 * @author The bubble
 * @version 4.0
 */
import java.util.List;

import cl.bubbles.model.Administrativo;
import cl.bubbles.model.Cliente;
import cl.bubbles.model.Profesional;
import cl.bubbles.model.Usuario;

public interface IUsuario {

	public List<Usuario> leerUsuario();
	public void crearUsuario(Usuario u);
	public  List<Usuario> registrarUsuario(Usuario u);
	public void crearAdministrativo(Administrativo a);
	public List<Administrativo> registrarAdministrativo(Administrativo a);
	public void crearCliente(Cliente c);
	public List<Cliente> registrarCliente(Cliente c);
	public void crearProfesional(Profesional p);
	public List<Profesional> registrarProfesional(Profesional p);
	public List<Administrativo> leerAdministrativo();
	public List<Cliente> leerCliente();
	public List<Profesional> leerProfesional();
	public Usuario buscarUsuario(String run);
	public void actualizarUsuario(Usuario u);
}
