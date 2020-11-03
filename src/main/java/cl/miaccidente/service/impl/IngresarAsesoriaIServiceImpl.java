package cl.miaccidente.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cl.miaccidente.entity.IngresarAsesoria;
import cl.miaccidente.repository.IngresarAsesoriaRepository;
import cl.miaccidente.service.IngresarAsesoriaService;

@Service("ingresarasesoriaservice")
public class IngresarAsesoriaIServiceImpl implements IngresarAsesoriaService {

	@Autowired
	@Qualifier("ingresarasesoriarepository")
	private IngresarAsesoriaRepository ingresarAsesoriaRepository;

	@Override
	public IngresarAsesoria ingresarAsesoria(IngresarAsesoria ingresarAsesoria) {
		return ingresarAsesoriaRepository.save(ingresarAsesoria);
	}

}