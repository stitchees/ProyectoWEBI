package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import ar.edu.unlam.tallerweb1.modelo.PlanViaje;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

public class ServicioPlanViajeImpl implements ServicioPlanViaje{

	// Maneja acciones de persistencia, normalmente estara inyectado el session factory de hibernate
	// el mismo esta difinido en el archivo hibernateContext.xml
	private SessionFactory sessionFactory;
	
	@Override
	public List<PlanViaje> mostrarPlanesDeViaje(Integer presupuesto, String destino) {
		
		// Se obtiene la sesion asociada a la transaccion iniciada en el servicio que invoca a este metodo y se crea un criterio
		// de busqueda de PlanViaje donde el email y password sean iguales a los del objeto recibido como parametro
		// uniqueResult da error si se encuentran mas de un resultado en la busqueda.
		final Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(PlanViaje.class)
				.add(Restrictions.between("presupuesto", 0, presupuesto))
				.add(Restrictions.like("destino", destino))
				.list();
	}

}
