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
 * Servlet implementation class InicioServlet
 * @author The bubble
 * @version 4.0
 */
@WebServlet("/InicioServlet")
public class InicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InicioServlet() {
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
			getServletContext().getRequestDispatcher("/view/index.jsp").forward(request, response);
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
