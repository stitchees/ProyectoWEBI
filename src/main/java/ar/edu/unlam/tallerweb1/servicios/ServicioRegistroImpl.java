package ar.edu.unlam.tallerweb1.servicios;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Cliente;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioCliente;

@Service("servicioRegistro")
	@Transactional
	public class ServicioRegistroImpl implements servicioRegistro{

		private RepositorioCliente servicioRegistro;
		
		@Autowired
		public ServicioRegistroImpl(RepositorioCliente servicioRegistro){
			this.servicioRegistro = servicioRegistro;
		}
		
		@Override
		public void agregarCliente(Cliente cliente) {
			
		 servicioRegistro.registrarCliente(cliente);

}
}

