package ar.edu.unlam.tallerweb1.repositorios;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import ar.edu.unlam.tallerweb1.modelo.Destino;
import ar.edu.unlam.tallerweb1.modelo.Domicilio;
import ar.edu.unlam.tallerweb1.modelo.Provincia;

@Repository("repositorioDestino")
public class RepositorioDestinoImpl implements RepositorioDestino {
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public RepositorioDestinoImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Destino> obtenerListaDestinos() {
		final Session session = sessionFactory.getCurrentSession();
		return listaDestinos();
	}
	
	public List<Destino> obtenerListaDestinosPara(String destino) {
		
		return listaDestinos(destino);
	}
	
	private List <Destino> listaDestinos(String destinoABuscar) {
		List <Destino> destinos = new ArrayList<>();
		Destino d1 = new Destino();
		Destino d2 = new Destino ();
		Destino d3 = new Destino ();
		Destino d4 = new Destino ();
		
		d1.setNombre("Argentina1");
		Domicilio dom = new Domicilio();
		Provincia p1 = new Provincia();
		p1.setDescripcion("Buenos Aires");
		dom.setProvincia(p1);
		d1.setDomicilio(dom);
		
		
		d2.setNombre("Argentina2");
		Domicilio dom2 = new Domicilio();
		Provincia p2 = new Provincia();
		p2.setDescripcion("Buenos Aires");
		dom2.setProvincia(p2);
		d2.setDomicilio(dom2);
		
		
		d3.setNombre("Colombia");
		Domicilio dom3 = new Domicilio();
		Provincia p3 = new Provincia();
		p3.setDescripcion("Bogota");
		dom3.setProvincia(p3);
		d3.setDomicilio(dom3);
		
		d4.setNombre("Mexico");
		Domicilio dom4 = new Domicilio();
		Provincia p4 = new Provincia();
		p4.setDescripcion("Cancun");
		dom4.setProvincia(p4);
		d4.setDomicilio(dom4);
		
		destinos.add(d1);
		destinos.add(d2);
		destinos.add(d3);
		destinos.add(d4);
		
		
		List <Destino> resultado = new ArrayList<>();

		for (Destino destino : destinos) {
			String nombrePcia = destino.getDomicilio().getProvincia().getDescripcion();
			
			if (destinoABuscar.equalsIgnoreCase(nombrePcia)) {
				resultado.add(destino);
			}
		}
		
		return resultado;
		
	}
	
	private List <Destino> listaDestinos() {
		List <Destino> destinos = new ArrayList<>();
		Destino d1 = new Destino();
		Destino d2 = new Destino ();
		Destino d3 = new Destino ();
		Destino d4 = new Destino ();
		
		d1.setNombre("Argentina1");
		
		
		d2.setNombre("Argentina2");
		
		d3.setNombre("Colombia");
		
		d4.setNombre("Mexico");
		
		destinos.add(d1);
		destinos.add(d2);
		destinos.add(d3);
		destinos.add(d4);
		
		return destinos;
	}
}
