package cl.bubbles.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.bubbles.implementacion.ImplementaCapacitacion;
import cl.bubbles.model.Capacitacion;
import cl.bubbles.model.EventoCapacitacion;

/**
 * Servlet implementation class ListarCapacitaciones
 * @author The bubble
 * @version 4.0
 */
@WebServlet("/ListarCapacitacionesServlet")
public class ListarCapacitacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitacionesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Creo objeto que simula el acceso a la base de datos y obtengo las capacitaciones
		// ImplementaCapacitacion ic = new ImplementaCapacitacion();
		// EventoCapacitacion ec = ic.leerCapacitacion();
		ImplementaCapacitacion ic = new ImplementaCapacitacion();
		EventoCapacitacion ec = new EventoCapacitacion();
		ec.setCapacitaciones(ic.leerTodo());
		
		// Pasamos datos a la vista
		request.setAttribute("capacitaciones", ec.getCapacitaciones());
		
		getServletContext().getRequestDispatcher("/view/listar_capacitaciones.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
