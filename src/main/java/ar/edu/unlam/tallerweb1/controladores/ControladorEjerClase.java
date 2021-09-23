package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorEjerClase {
	
	@RequestMapping(value = "/metodoGet" , method = RequestMethod.GET)
	public ModelAndView metodoGet(@RequestParam(value = "firstname", required = false) String nombre ,
								  @RequestParam(value = "sourcename", required = true) String apellido) {
		
		String menssage = "el nombre ingresado es, " + nombre + " !";
		String menssage2 = "el apellido es, " + apellido;
		ModelMap model = new ModelMap();
		model.put("msg",menssage);
		model.put("msg2",menssage2);
		return new ModelAndView("mensaje",model);
	}
	
	
	
}
