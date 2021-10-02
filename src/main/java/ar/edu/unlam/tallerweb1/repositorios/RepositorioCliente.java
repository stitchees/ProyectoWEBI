package ar.edu.unlam.tallerweb1.repositorios;

import ar.edu.unlam.tallerweb1.modelo.Cliente;

public interface RepositorioCliente {

	Cliente consultarCliente(Cliente cliente);

	Cliente verificarCorreo(Cliente cliente);
	
	void registrarCliente(Cliente cliente);
	
	Boolean verificarPassword(Cliente cliente);

}
