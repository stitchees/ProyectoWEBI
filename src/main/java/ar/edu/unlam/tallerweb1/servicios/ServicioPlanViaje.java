package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.PlanViaje;

public interface ServicioPlanViaje {

	List<PlanViaje> mostrarPlanesDeViaje(Integer presupuesto, String destino);

}
