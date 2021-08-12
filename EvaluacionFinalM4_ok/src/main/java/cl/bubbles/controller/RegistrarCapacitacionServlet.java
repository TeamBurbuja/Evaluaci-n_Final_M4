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
 * Servlet implementation class RegistrarCapacitacionServlet
 * @author The bubble
 * @version 4.0
 */
@WebServlet("/RegistrarCapacitacionServlet")
public class RegistrarCapacitacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarCapacitacionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Obtengo datos de la capacitación ingresada por medio del formulario
		/*
		 * int id = Integer.parseInt(request.getParameter("id")); String rut =
		 * request.getParameter("rut"); String dia = request.getParameter("dia"); String
		 * hora = request.getParameter("hora"); String lugar =
		 * request.getParameter("lugar"); int duracion =
		 * Integer.parseInt(request.getParameter("duracion")); int asistentes =
		 * Integer.parseInt(request.getParameter("asistentes"));
		 * 
		 * Capacitacion c = new Capacitacion();
		 * 
		 * c.setIdCapacitacion(id); c.setRutCliente(rut); c.setDia(dia);
		 * c.setHora(hora); c.setLugar(lugar); c.setDuracion(duracion);
		 * c.setCantidadAsistentes(asistentes);
		 * 
		 * ImplementaCapacitacion impCap = new ImplementaCapacitacion();
		 * List<Capacitacion> cap = impCap.registrarCapacitacion(c);
		 * 
		 * request.setAttribute("capacitacion", cap);
		 * 
		 * getServletContext().getRequestDispatcher("/view/ingreso_capacitacion.jsp").
		 * forward(request, response);
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		Capacitacion c = new Capacitacion();
		
		c.setIdCapacitacion(Integer.parseInt(request.getParameter("id")));
		c.setRutCliente(request.getParameter("rut"));
		c.setDia(request.getParameter("dia"));
		c.setHora(request.getParameter("hora"));
		c.setLugar(request.getParameter("lugar"));
		c.setDuracion(Integer.parseInt(request.getParameter("duracion")));
		c.setCantidadAsistentes(Integer.parseInt(request.getParameter("asistentes")));
		
		ImplementaCapacitacion ic = new ImplementaCapacitacion();
		ic.crearCapacitacion(c);
		List<Capacitacion> cap = ic.registrarCapacitacion(c);
		
		request.setAttribute("capacitacion", cap);
		
		getServletContext().getRequestDispatcher("/view/ingreso_capacitacion.jsp").forward(request, response);
		
	}

}
