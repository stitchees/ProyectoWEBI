package ar.edu.unlam.tallerweb1.repositorios;

import java.util.ArrayList;

import antlr.collections.List;
import ar.edu.unlam.tallerweb1.modelo.Localidad;

public interface RepositorioLocalidad {

	Boolean agregarLocalidad(Localidad loc);

	Boolean EliminarLocalidad(Long id);

	ArrayList<Localidad> consultarLocalidad();

	Localidad consultarUnaLocalidad(Localidad loc);

}
