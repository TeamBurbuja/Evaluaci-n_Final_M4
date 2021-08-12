package cl.bubbles.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.bubbles.implementacion.ImplementaUsuarios;
import cl.bubbles.model.EventoUsuario;
import cl.bubbles.model.Sesion;

/**
 * Servlet implementation class ListadoUsuarios
 * @author The bubble
 * @version 4.0
 */
@WebServlet("/ListadoUsuariosServlet")
public class ListadoUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoUsuariosServlet() {
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
			ImplementaUsuarios iu = new ImplementaUsuarios();
			EventoUsuario eu = new EventoUsuario();
			eu.setUsuarios(iu.leerUsuario());
			
			request.setAttribute("usuarios", eu.getUsuarios());
			
			getServletContext().getRequestDispatcher("/view/listado_usuarios.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
