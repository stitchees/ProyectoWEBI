package ar.edu.unlam.tallerweb1.servicios;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Cliente;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioCliente;


@Service
@Transactional
public class ServicioClienteImpl implements ServicioCliente{

	private RepositorioCliente servicioCliente;
	
	@Autowired
	public ServicioClienteImpl(RepositorioCliente servicioCliente){
		this.servicioCliente = servicioCliente;
	}
	
	
	@Override
	public Cliente consultarCliente(Cliente cliente) {
		
		return servicioCliente.consultarCliente(cliente);
	}

	@Override
	public Cliente verificarCorreo(Cliente cliente) {
		return servicioCliente.verificarCorreo(cliente);
	}

	@Override
	public void registrarCliente(Cliente cliente) {
		servicioCliente.registrarCliente(cliente);
		
	}

	@Override
	public Boolean verificarPassword(Cliente cliente) {

		return servicioCliente.verificarPassword(cliente);
	}
	

}
