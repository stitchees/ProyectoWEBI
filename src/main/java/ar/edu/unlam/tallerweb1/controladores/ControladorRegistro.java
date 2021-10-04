package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Cliente;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioCliente;
import ar.edu.unlam.tallerweb1.servicios.ServicioLocalidad;
import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;
import ar.edu.unlam.tallerweb1.servicios.servicioRegistro;


@Controller
public class ControladorRegistro {
	
	
	private servicioRegistro servicioRegistro;
	private ServicioLogin servicioLogin;
	private ServicioCliente servicioCliente;
	private ServicioLocalidad servicioLocalidad;
	
	@Autowired
	public ControladorRegistro(servicioRegistro servicioRegistro, ServicioLogin servicioLogin, ServicioCliente servicioCliente, ServicioLocalidad servicioLocalidad){
		this.servicioRegistro = servicioRegistro;
		this.servicioLogin = servicioLogin;
		this.servicioCliente = servicioCliente;
		this.servicioLocalidad = servicioLocalidad;
	}
	
	
	@RequestMapping("/mostrarRegistro")
	public 	ModelAndView registro() {
		ModelMap modelo = new ModelMap(); //Agrupa todo para mandarlo a vista
		Cliente cliente = new Cliente();//Se crea un usuario vacio para mandarlo vacio para que el formulario se vaya llenando
		modelo.put("cliente", cliente);
		return new ModelAndView("registro", modelo); //Se le envia a la vista registro el modelo con el objeto usuario
	}
	@RequestMapping(path="/procesarRegistro", method=RequestMethod.POST)
	public ModelAndView procesarRegistroUduario(
			@ModelAttribute("cliente") Cliente cliente,
			@RequestParam(value="repassword", required=false) String repass //Se pone la respassword porque no existe como atributo en Usuario
			) {
		//Validar que la password sea igual a la repassword
		ModelMap modelo = new ModelMap();
		Usuario usuario = new Usuario();
		Cliente verif = servicioCliente.verificarCorreo(cliente);
		Boolean verificarPass = servicioCliente.verificarPassword(cliente);
		List<String> listaLocalidades = servicioLocalidad.devolverNombresDeLocalidades();
		if(cliente.getNombre() != "" && cliente.getApellido() != "" && cliente.getLocalidad() != ""){
			if(verif == null) {
				if(verificarPass == true) {
					if(cliente.getPassword().equals(repass)) {
					modelo.put("cliente", cliente);
					cliente.setRoll("cliente");
					usuario.setEmail(cliente.getEmail());
					usuario.setPassword(cliente.getPassword());
					servicioRegistro.agregarCliente(cliente);
				}else {
					modelo.put("mensaje", "Error. No coinciden las passwords");
					return new ModelAndView("registro", modelo);
				}
				
				}else {
					modelo.put("mensaje", "Su contraseña debe contener al menos 8 caractéres, 1 mayúscula, 1 minúscula y 1 número.");
					return new ModelAndView("registro", modelo);
				}
				
			}else {
				modelo.put("mensaje", "Correo ya registrado. Por favor, ingrese otro.");
				return new ModelAndView("registro", modelo);
			}		
				
		}else {
			modelo.put("mensaje", "Complete los campos faltantes");
			return new ModelAndView("registro", modelo);
			
		}
		return new ModelAndView("confirmacionRegistro", modelo);
			
	}
}


