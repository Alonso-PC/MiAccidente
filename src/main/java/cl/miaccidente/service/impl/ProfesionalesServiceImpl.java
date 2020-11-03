package cl.miaccidente.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cl.miaccidente.entity.Profesionales;
import cl.miaccidente.repository.ProfesionalesRepository;
import cl.miaccidente.service.ProfesionalesService;

@Service("profesionalesservice")
public class ProfesionalesServiceImpl implements ProfesionalesService {

	@Autowired
	@Qualifier("profesionalesrepository")
	private ProfesionalesRepository profesionalesRepository;

	@Override
	public Profesionales agregarProfesionales(Profesionales profesionales) {

		return profesionalesRepository.save(profesionales);
	}

	@Override
	public List<Profesionales> listarProfesionales() {
		List<Profesionales> profesionales = new ArrayList<>();
		profesionales = profesionalesRepository.findAll();
		return profesionales;
	}

	@Override
	public Profesionales findProfesionalesById(int id) {

		return profesionalesRepository.findById(id);
	}

	@Override
	public void removeProfesionales(int id) {
		Profesionales prof = findProfesionalesById(id);
		if (null != prof) {
			profesionalesRepository.delete(prof);
		}
	}
}
