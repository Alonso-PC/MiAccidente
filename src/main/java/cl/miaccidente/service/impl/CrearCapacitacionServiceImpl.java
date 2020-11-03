package cl.miaccidente.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cl.miaccidente.entity.CrearCapacitacion;
import cl.miaccidente.repository.CrearCapacitacionRepository;
import cl.miaccidente.service.CrearCapacitacionService;

@Service("crearcapacitacionservice")
public class CrearCapacitacionServiceImpl implements CrearCapacitacionService {

	@Autowired
	@Qualifier("crearcapacitacionrepository")
	private CrearCapacitacionRepository crearCapacitacionRepository;

	@Override
	public CrearCapacitacion crearCapacitacion(CrearCapacitacion crearCapacitacion) {
		return crearCapacitacionRepository.save(crearCapacitacion);
	}

}