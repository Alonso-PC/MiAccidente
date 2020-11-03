package cl.miaccidente.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cl.miaccidente.repository.ActividadesRepository;
import cl.miaccidente.entity.Actividades;
import cl.miaccidente.service.ActividadesService;

@Service("actividadesservice")
public class ActividadesServiceImpl implements ActividadesService {

	@Autowired
	@Qualifier("actividadesrepository")
	private ActividadesRepository actividadesRepository;

	@Override
	public List<Actividades> listarActividades() {
		return actividadesRepository.findAll();
	}

}
