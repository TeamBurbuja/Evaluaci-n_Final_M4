package cl.bubbles.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.bubbles.implementacion.ImplementaUsuarios;
import cl.bubbles.model.Usuario;

/**
 * Servlet implementation class EditarUsuarioServlet
 * @author The bubble
 * @version 4.0
 */
@WebServlet("/EditarUsuarioServlet")
public class EditarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ImplementaUsuarios iu = new ImplementaUsuarios();
		String run = request.getParameter("run");
		Usuario u = iu.buscarUsuario(run);
		
		String resultado = request.getParameter("result");
		request.setAttribute("u", u);
		
		if (resultado.equals("ver")) {
			
			getServletContext().getRequestDispatcher("/view/usuario_alone.jsp").forward(request, response);
			
		} else {
			
			getServletContext().getRequestDispatcher("/view/editar_usuario.jsp").forward(request, response);
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		Usuario u = new Usuario();
		
		u.setNombre(request.getParameter("nombre"));
		u.setFechaNacimiento(request.getParameter("fecha_nac"));
		u.setRun(request.getParameter("run"));
		u.setTipoUsuario(request.getParameter("tipo_usuario"));
		
		System.out.println(u);
		
		ImplementaUsuarios iu = new ImplementaUsuarios();
		iu.actualizarUsuario(u);
		
		getServletContext().getRequestDispatcher("/ListadoUsuariosServlet").forward(request, response);
		
	}

}
