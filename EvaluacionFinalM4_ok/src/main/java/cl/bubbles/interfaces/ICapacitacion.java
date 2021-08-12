 package cl.bubbles.interfaces;
 /**
  * Interface que permite definir los métodos a implementar
  * para el objeto capacitación
  * @author The bubble
  * @version 4.0
  */
import java.util.List;

import cl.bubbles.model.Capacitacion;
import cl.bubbles.model.EventoCapacitacion;

public interface ICapacitacion {
	
	public EventoCapacitacion leerCapacitacion();
	public List<Capacitacion> registrarCapacitacion(Capacitacion c);
	public void crearCapacitacion(Capacitacion c);
	public List<Capacitacion> leerTodo();
	
}
