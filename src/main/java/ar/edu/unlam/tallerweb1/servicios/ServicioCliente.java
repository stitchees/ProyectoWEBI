package ar.edu.unlam.tallerweb1.servicios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Cliente;

public interface ServicioCliente {
	Cliente consultarCliente(Cliente cliente);

	Cliente verificarCorreo(Cliente cliente);
	
	void registrarCliente(Cliente cliente);
	
	Boolean verificarPassword(Cliente cliente);
	
}