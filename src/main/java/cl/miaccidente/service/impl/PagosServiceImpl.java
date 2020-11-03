package cl.miaccidente.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cl.miaccidente.entity.Pagos;
import cl.miaccidente.repository.PagosRepository;
import cl.miaccidente.service.PagosService;

@Service("pagosservice")
public class PagosServiceImpl implements PagosService {

	@Autowired
	@Qualifier("pagosrepository")
	private PagosRepository pagosRepository;

	@Override
	public List<Pagos> listarPagos() {
		return pagosRepository.findAll();
	}

}
