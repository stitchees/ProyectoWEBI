package ar.edu.unlam.tallerweb1.servicios;


import java.util.List;


import ar.edu.unlam.tallerweb1.modelo.Destino;

public interface ServicioDestino {

	public List<Destino> obtenerListaDestinos();

	public List<Destino> obtenerDestinosParaUbicacion(String destino);
		

}
