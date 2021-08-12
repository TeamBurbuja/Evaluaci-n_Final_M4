package cl.bubbles.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.bubbles.implementacion.ImplementaUsuarios;
import cl.bubbles.model.Cliente;

/**
 * Servlet implementation class ClienteServlet
 * @author The bubble
 * @version 4.0
 */
@WebServlet("/ClienteServlet")
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteServlet() {
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
		Cliente c = new Cliente();
		
		c.setRutEmpresa(request.getParameter("rut_empresa"));
		c.setRazonSocial(request.getParameter("razon"));
		c.setDireccion(request.getParameter("direccion"));
		c.setComuna(request.getParameter("comuna"));
		c.setCantidadEmpleados(Integer.parseInt(request.getParameter("c_empleados")));
		c.setTelefono(request.getParameter("telefono"));
		
		ImplementaUsuarios iu = new ImplementaUsuarios();
		iu.crearCliente(c);
		List<Cliente> cli = iu.registrarCliente(c);
		
		request.setAttribute("cliente", cli);
		
		getServletContext().getRequestDispatcher("/view/ingreso_cliente.jsp").forward(request, response);
		
	}

}






