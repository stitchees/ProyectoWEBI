package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PlanViaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne  
	//@JoinColumn(name = "id")
	private Vuelo vueloIda;
	@OneToOne  
	//@JoinColumn(name = "id")
	private Vuelo vueloVuelta;
	private Integer cantidadDias;
	private Double precio;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Vuelo getVueloIda() {
		return vueloIda;
	}
	public void setVueloIda(Vuelo vueloIda) {
		this.vueloIda = vueloIda;
	}
	public Vuelo getVueloVuelta() {
		return vueloVuelta;
	}
	public void setVueloVuelta(Vuelo vueloVuelta) {
		this.vueloVuelta = vueloVuelta;
	}
	public Integer getCantidadDias() {
		return cantidadDias;
	}
	public void setCantidadDias(Integer cantidadDias) {
		this.cantidadDias = cantidadDias;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
