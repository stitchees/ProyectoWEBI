package ar.edu.unlam.tallerweb1.modelo;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Vuelo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	private String nroVuelo;
	private String aerolinea;
	private Double costo;
	private Time hora;
	private Date fecha;
	@OneToOne  
	//@JoinColumn(name = "id")
	private Aeropuerto aeropuertoOrigen;
	@OneToOne  
	//@JoinColumn(name = "id")
	private Aeropuerto aeropuertoDestino;
	public Long getId() {
		return id;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNroVuelo() {
		return nroVuelo;
	}
	public void setNroVuelo(String nroVuelo) {
		this.nroVuelo = nroVuelo;
	}
	public String getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Aeropuerto getAeropuertoOrigen() {
		return aeropuertoOrigen;
	}
	public void setAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
		this.aeropuertoOrigen = aeropuertoOrigen;
	}
	public Aeropuerto getAeropuertoDestino() {
		return aeropuertoDestino;
	}
	public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) {
		this.aeropuertoDestino = aeropuertoDestino;
	}

}
