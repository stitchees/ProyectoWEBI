package ar.edu.unlam.tallerweb1.repositorios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.PlanViaje;

public interface RepositorioPlanViaje {

	static List<PlanViaje> consultarPlanesDeViaje(Integer presupuesto, String destino);

	
}
