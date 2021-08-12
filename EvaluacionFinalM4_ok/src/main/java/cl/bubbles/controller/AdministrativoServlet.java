package cl.bubbles.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.bubbles.implementacion.ImplementaUsuarios;
import cl.bubbles.model.Administrativo;

/**
 * Servlet implementation class AdministrativoServlet
 * @author The bubble
 * @version 4.0
 */
@WebServlet("/AdministrativoServlet")
public class AdministrativoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdministrativoServlet() {
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
		// doGet(request, response);
		Administrativo a = new Administrativo();
		
		a.setId(Integer.parseInt(request.getParameter("id")));
		a.setNombreSuperior(request.getParameter("nombre_superior"));
		a.setArea(request.getParameter("area"));
		a.setFuncion(request.getParameter("funcion"));
		a.setExperienciaPrevia(request.getParameter("exp_previa"));
		
		ImplementaUsuarios iu = new ImplementaUsuarios();
		iu.crearAdministrativo(a);
		List<Administrativo> adm = iu.registrarAdministrativo(a);
		
		request.setAttribute("administrativo", adm);
		
		getServletContext().getRequestDispatcher("/view/ingreso_administrativo.jsp").forward(request, response);
		
	}

}
