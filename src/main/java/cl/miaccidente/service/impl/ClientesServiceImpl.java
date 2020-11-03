package cl.miaccidente.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cl.miaccidente.entity.Clientes;
import cl.miaccidente.repository.ClientesRepository;
import cl.miaccidente.service.ClientesService;

@Service("clientesservice")
public class ClientesServiceImpl implements ClientesService {

	@Autowired
	@Qualifier("clientesrepository")
	private ClientesRepository clientesRepository;

	@Override
	public List<Clientes> listarClientes() {

		List<Clientes> clientes = new ArrayList<>();
		clientes = clientesRepository.findAll();
		return clientes;
	}

	@Override
	public Clientes agregarClientes(Clientes clientes) {
		return clientesRepository.save(clientes);
	}

	@Override
	public Clientes findClientesById(int id) {
		return clientesRepository.findById(id);
	}

	@Override
	public void removeCliente(int id) {
		Clientes cl = findClientesById(id);

		if (null != cl) {
			clientesRepository.delete(cl);
		}
	}
}