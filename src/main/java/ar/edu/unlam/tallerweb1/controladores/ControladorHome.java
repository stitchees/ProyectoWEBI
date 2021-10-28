package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.servicios.ServicioDestinoImpl;

@Controller
public class ControladorHome {
	ServicioDestinoImpl servicioDestino = new ServicioDestinoImpl();
	// Escucha la URL /home por GET, y redirige a una vista.
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView irAHome() {
		return new ModelAndView("home");
	}
	// Escucha la URL /home por GET, y redirige a una vista.
	//request param
	@RequestMapping(path = "/obtenerPlanes", method = RequestMethod.GET)

	public ModelAndView irAObtenerPlanes(
			@RequestParam("presupuesto") Integer presupuesto,
			@RequestParam("destino") String destino
			) {
		
		ModelMap model =new ModelMap();
		//ServicioDestino servicioDestino.buscar()

		
		if(presupuesto==null || destino==null) {
			return new ModelAndView("home");
		}else{
			model.put("presupuesto", presupuesto);
			model.put("destino", destino);
			return new ModelAndView("obtenerPlanes",model);
		}
		
	}
}
