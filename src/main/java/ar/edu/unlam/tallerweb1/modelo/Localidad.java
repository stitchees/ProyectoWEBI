package ar.edu.unlam.tallerweb1.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Localidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	


	private List<Hotel> hoteles;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public List<Hotel> getHoteles() {
		return hoteles;
	}


	public void setHoteles(List<Hotel> hoteles) {
		this.hoteles = hoteles;
	}
	
	
}
