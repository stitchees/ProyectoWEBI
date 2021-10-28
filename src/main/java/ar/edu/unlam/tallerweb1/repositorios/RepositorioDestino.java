package ar.edu.unlam.tallerweb1.repositorios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Destino;

public interface RepositorioDestino {

	List<Destino> obtenerListaDestinos();
	
	List<Destino> obtenerListaDestinosPara(String destino);


}
