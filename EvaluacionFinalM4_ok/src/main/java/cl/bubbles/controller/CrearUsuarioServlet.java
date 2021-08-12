package cl.bubbles.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.bubbles.implementacion.ImplementaUsuarios;
import cl.bubbles.model.Sesion;
import cl.bubbles.model.Usuario;

/**
 * Servlet implementation class CrearUsuarioServlet
 * @author The bubble
 * @version 4.0
 */
@WebServlet("/CrearUsuarioServlet")
public class CrearUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Rescatamos sesión http
		HttpSession session = request.getSession();
		// Rescatamos objeto usuario y aplicamos cast
		Sesion user = (Sesion) session.getAttribute("usuario");
		// Validamos si existe una sesión iniciada
		if (user == null) {
			getServletContext().getRequestDispatcher("/LoginServlet").forward(request, response);
		} else {
			getServletContext().getRequestDispatcher("/view/crear_usuario.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tipoUsuario = request.getParameter("tipo_usuario");
		System.out.println(tipoUsuario);
		
		switch (tipoUsuario) {
		case "administrativo":
			
			Usuario adm = new Usuario();
			
			adm.setId(Integer.parseInt(request.getParameter("id")));
			adm.setNombre(request.getParameter("nombre"));
			adm.setFechaNacimiento(request.getParameter("fecha_nac"));
			adm.setRun(request.getParameter("run"));
			adm.setTipoUsuario(request.getParameter("tipo_usuario"));
			
			ImplementaUsuarios iAdm = new ImplementaUsuarios();
			iAdm.crearUsuario(adm);
			List<Usuario> userAdm = iAdm.registrarUsuario(adm);
			
			request.setAttribute("usuario", userAdm);
			
			getServletContext().getRequestDispatcher("/view/crear_administrativo.jsp").forward(request, response);
			break;
		
		case "cliente":
			
			Usuario cli = new Usuario();
			
			cli.setId(Integer.parseInt(request.getParameter("id")));
			cli.setNombre(request.getParameter("nombre"));
			cli.setFechaNacimiento(request.getParameter("fecha_nac"));
			cli.setRun(request.getParameter("run"));
			cli.setTipoUsuario(request.getParameter("tipo_usuario"));
			
			ImplementaUsuarios iCli = new ImplementaUsuarios();
			iCli.crearUsuario(cli);
			List<Usuario> userCli = iCli.registrarUsuario(cli);
			
			request.setAttribute("usuario", userCli);
			
			getServletContext().getRequestDispatcher("/view/crear_cliente.jsp").forward(request, response);
			break;
			
		case "profesional":
			
			Usuario pro = new Usuario();
			
			pro.setId(Integer.parseInt(request.getParameter("id")));
			pro.setNombre(request.getParameter("nombre"));
			pro.setFechaNacimiento(request.getParameter("fecha_nac"));
			pro.setRun(request.getParameter("run"));
			pro.setTipoUsuario(request.getParameter("tipo_usuario"));
			
			ImplementaUsuarios iPro = new ImplementaUsuarios();
			iPro.crearUsuario(pro);
			List<Usuario> userPro = iPro.registrarUsuario(pro);
			
			request.setAttribute("usuario", userPro);
			
			getServletContext().getRequestDispatcher("/view/crear_profesional.jsp").forward(request, response);
			break;
			
		default:
			break;
		}
	}
}
