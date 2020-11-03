package cl.miaccidente.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cl.miaccidente.entity.ActividadMejora;
import cl.miaccidente.repository.ActividadMejoraRepository;
import cl.miaccidente.service.ActividadMejoraService;

@Service("actividadmejoraservice")
public class ActividadMejoraImpl implements ActividadMejoraService {

	@Autowired
	@Qualifier("actividadmejorarepository")
	private ActividadMejoraRepository actividadMejoraRepository;

	@Override
	public List<ActividadMejora> listarActividadMejora() {

		List<ActividadMejora> actividadmejora = new ArrayList<>();
		actividadmejora = actividadMejoraRepository.findAll();
		return actividadmejora;
	}

	@Override
	public ActividadMejora agregarActividadMejora(ActividadMejora actividadmejora) {
		return actividadMejoraRepository.save(actividadmejora);
	}

	@Override
	public ActividadMejora findActividadMejoraById(int id) {
		return actividadMejoraRepository.findById(id);
	}

	@Override
	public void removeActividadMejora(int id) {
		ActividadMejora am = findActividadMejoraById(id);

		if (null != am) {
			actividadMejoraRepository.delete(am);
		}
	}
}
