package ar.edu.unlam.tallerweb1.repositorios;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Cliente;

@Repository("repositorioCliente")
	public class RepositorioClienteImpl implements RepositorioCliente{
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public RepositorioClienteImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}


	@Override
	public Cliente consultarCliente(Cliente cliente) {
		 Session session = sessionFactory.getCurrentSession();
		return (Cliente) session.createCriteria(Cliente.class)
				.add(Restrictions.eq("email", cliente.getEmail()))
				.add(Restrictions.eq("password", cliente.getPassword()))				
				.uniqueResult();
	}
	
	@Override
	public Cliente verificarCorreo(Cliente cliente) {
		Session session = sessionFactory.getCurrentSession();
		return (Cliente) session.createCriteria(Cliente.class)
				.add(Restrictions.eq("email", cliente.getEmail()))
				.uniqueResult();
	}

	@Override
	public void registrarCliente(Cliente cliente) {
		Session session = sessionFactory.getCurrentSession();
		String nombre = cliente.getNombre();
		String apellido = cliente.getApellido();
		String email = cliente.getEmail();
		String loc = cliente.getLocalidad();
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setEmail(email);
		cliente.setLocalidad(loc);
		session.save(cliente);
		
	}
	

	@Override
	public Boolean verificarPassword(Cliente cliente) {
		String passValidar = cliente.getPassword();
		char pass;
		byte contNumero = 0, contMayus = 0, contMin = 0;
		
		if(passValidar.length() >= 8) {
			for(byte i = 0; i < passValidar.length(); i++) {
				pass = passValidar.charAt(i);
				String passValue = String.valueOf(pass);
				if (passValue.matches("[A-Z]")) {
					contMayus++;
	            } else if (passValue.matches("[a-z]")) {
	            	contMin++;
	            } else if (passValue.matches("[0-9]")) {
	                contNumero++;
	            }
			}if(contNumero >= 1 && contMayus >= 1 && contMin >= 1) {
				return true;
			}
				return false;
		}else {
			return false;
		}
	}


}
