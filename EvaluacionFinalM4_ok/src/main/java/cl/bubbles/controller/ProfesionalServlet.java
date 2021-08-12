package cl.bubbles.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.bubbles.implementacion.ImplementaUsuarios;
import cl.bubbles.model.Profesional;

/**
 * Servlet implementation class ProfesionalServlet
 * @author The bubble
 * @version 4.0
 */
@WebServlet("/ProfesionalServlet")
public class ProfesionalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfesionalServlet() {
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
		Profesional p = new Profesional();
		
		p.setId(Integer.parseInt(request.getParameter("id")));
		p.setAniosExperiencia(Integer.parseInt(request.getParameter("experiencia")));
		p.setDepartamento(request.getParameter("departamento"));
		p.setTitulo(request.getParameter("titulo"));
		p.setFechaIngreso(request.getParameter("fecha"));
		
		ImplementaUsuarios iu = new ImplementaUsuarios();
		iu.crearProfesional(p);
		List<Profesional> pro = iu.registrarProfesional(p);
		
		request.setAttribute("profesional", pro);
		
		getServletContext().getRequestDispatcher("/view/ingreso_profesional.jsp").forward(request, response);
		
	}

}
