package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorHome {
	
	// Escucha la URL /home por GET, y redirige a una vista.
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView irAHome() {
		return new ModelAndView("home");
	}
	// Escucha la URL /home por GET, y redirige a una vista.
	@RequestMapping(path = "/obtenerPlanes/{presupuesto}/{destino}", method = RequestMethod.GET)
	public ModelAndView irAObtenerPlanes(
			@PathVariable Integer presupuesto,
			@PathVariable String destino
			) {
		ModelMap model =new ModelMap();
	

		if(presupuesto==null || destino==null) {
			return new ModelAndView("home");
		}else{
			model.put("presupuesto", presupuesto);
			model.put("destino", destino);
			return new ModelAndView("obtenerPlanes",model);
		}
		
	}
}
