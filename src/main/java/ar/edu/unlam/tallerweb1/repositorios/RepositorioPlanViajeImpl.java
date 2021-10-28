package ar.edu.unlam.tallerweb1.repositorios;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unlam.tallerweb1.modelo.PlanViaje;

public class RepositorioPlanViajeImpl implements RepositorioPlanViaje{

	// Maneja acciones de persistencia, normalmente estara inyectado el session factory de hibernate
	// el mismo esta difinido en el archivo hibernateContext.xml
	static SessionFactory sessionFactory;
	@Autowired
	public RepositorioPlanViajeImpl(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void setSessionFactory(SessionFactory sessionFactory) {
		RepositorioPlanViajeImpl.sessionFactory = sessionFactory;
	}
	public static List<PlanViaje> consultarPlanesDeViaje(Integer presupuesto, String destino) {
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
