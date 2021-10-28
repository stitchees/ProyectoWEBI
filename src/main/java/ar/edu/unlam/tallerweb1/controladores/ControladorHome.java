package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Cliente;
import ar.edu.unlam.tallerweb1.modelo.Destino;
import ar.edu.unlam.tallerweb1.modelo.PlanViaje;
import ar.edu.unlam.tallerweb1.servicios.ServicioDestino;
import ar.edu.unlam.tallerweb1.servicios.ServicioPlanViaje;

@Controller
public class ControladorHome {

	private ServicioDestino servicioDestino;
	private ServicioPlanViaje servicioPlanViaje;
	@Autowired
	public ControladorHome(ServicioDestino servicioDestino) {
		this.servicioDestino = servicioDestino;
	}

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView irAHome() {
		return new ModelAndView("home");
	}

	@RequestMapping(path = "/obtenerPlanes/{presupuesto}/{destino}", method = RequestMethod.GET)
	public ModelAndView irAObtenerPlanes(
			@PathVariable Integer presupuesto,
			@PathVariable String destino
			) {
		ModelMap model = new ModelMap();

		if (presupuesto == null || destino == null) {

			return new ModelAndView("home");
		} else {
			model.put("presupuesto", presupuesto);
			model.put("destino", destino);
			List<PlanViaje> planViajeList = servicioPlanViaje.mostrarPlanesDeViaje(presupuesto,destino);
			model.put("planViajes", planViajeList);
			return new ModelAndView("obtenerPlanes", model);
		}

	}

	@RequestMapping(path = "/obtenerDestinos", method = RequestMethod.GET)
	public ModelAndView obtenerDestinos(@RequestParam("destino") String destino) {
		List<Destino> destinos = servicioDestino.obtenerDestinosParaUbicacion(destino);
				
		ModelMap modelo = new ModelMap();

		modelo.put("destinos", destinos);

		return new ModelAndView("obtenerDestinos", modelo);

	}
	
	@RequestMapping(path = "/homeDestino", method = RequestMethod.GET)
	public ModelAndView irAHomeDestino() {
		return new ModelAndView("homeDestino");
	}

}
