package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ServicioLocalidad")
@Transactional

public class ServicioLocalidadImpl implements ServicioLocalidad {

	@Override
	public List<String> devolverNombresDeLocalidades() {
		// TODO Auto-generated method stub
		return null;
	}

}
