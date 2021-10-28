package ar.edu.unlam.tallerweb1.servicios;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Destino;
import ar.edu.unlam.tallerweb1.repositorios.RepositorioDestino;

@Service
@Transactional
public class ServicioDestinoImpl implements ServicioDestino {
	
	private RepositorioDestino repositorioDestino;
	
	@Autowired
	
	public ServicioDestinoImpl (RepositorioDestino repositorioDestino) {
		this.repositorioDestino = repositorioDestino;
	}

	public List<Destino> obtenerListaDestinos() {
		return repositorioDestino.obtenerListaDestinos();
	}

	@Override
	public List<Destino> obtenerDestinosParaUbicacion(String destino) {
		return repositorioDestino.obtenerListaDestinosPara(destino);
	}


}
