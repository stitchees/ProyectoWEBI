package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import ar.edu.unlam.tallerweb1.modelo.PlanViaje;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioPlanViaje;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioPlanViajeImpl;

public class ServicioPlanViajeImpl implements ServicioPlanViaje{


	
	@Override
	public List<PlanViaje> mostrarPlanesDeViaje(Integer presupuesto, String destino) {
		
		return RepositorioPlanViajeImpl.consultarPlanesDeViaje(presupuesto,destino);
	}

}
