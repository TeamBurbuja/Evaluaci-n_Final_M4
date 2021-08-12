package cl.bubbles.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.bubbles.model.Sesion;

/**
 * Servlet implementation class ValidarSesionServlet
 * @author The bubble
 * @version 4.0
 */
@WebServlet("/ValidarSesionServlet")
public class ValidarSesionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidarSesionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		// Obtengo usuario y contraseña ingresados
		String usuario = request.getParameter("rut");
		String password = request.getParameter("password");
		
		// Validamos usuario = "admin", password = "1234"
		if (usuario.equalsIgnoreCase("5203384-5")) {
			if (password.equalsIgnoreCase("1234")) {
				// Creamos instancia de objeto usuario
				Sesion user = new Sesion(usuario, password);
				// Rescatamos sesión http
				HttpSession session = request.getSession();
				session.setAttribute("usuario", user);
				getServletContext().getRequestDispatcher("/InicioServlet").forward(request, response);
			} else {
				// Password incorrecta
				getServletContext().getRequestDispatcher("/ErrorLoginServlet").forward(request, response);
			}
		} else {
			// Usuario incorrecto
			getServletContext().getRequestDispatcher("/ErrorLoginServlet").forward(request, response);
		}
	}

}
