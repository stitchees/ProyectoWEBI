package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import ar.edu.unlam.tallerweb1.enums.TipoDeDestino;

@Entity
public class Destino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne  

	//@JoinColumn(name = "id")

	private Domicilio domicilio;
	private TipoDeDestino tipo;
	public Long getId() {
		return id;
	}
	
	public String nombre;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TipoDeDestino getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeDestino tipo) {
		this.tipo = tipo;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
}
