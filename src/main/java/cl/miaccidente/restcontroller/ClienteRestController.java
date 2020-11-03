package cl.miaccidente.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.miaccidente.entity.Clientes;
import cl.miaccidente.service.ClientesService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {

	@Autowired
	public ClientesService clienteService;

	@GetMapping("/todos")
	public List<Clientes> buscarTodos() {
		return clienteService.listarClientes();
	}

	/* @PathVariable permite interpretar el "id" del endpoint dentro del método */
	@GetMapping("/{id}")
	public Clientes buscarId(@PathVariable int id) {
		return clienteService.findClientesById(id);
	}

	/* @RequestBody interpreta el json y lo convierte en el objeto indicado */
	/* ResponseEntity permite definir un estado de HTTP */
	@PostMapping("/crear")
	public ResponseEntity<Clientes> crearCliente(@RequestBody Clientes cliente) {
		Clientes objCliente = clienteService.agregarClientes(cliente);		
		return new ResponseEntity<Clientes>(objCliente, HttpStatus.CREATED);
	}
	
	@GetMapping("/eliminar/{id}")
	public ResponseEntity<Clientes> eliminarCliente(@PathVariable int id){
		Clientes objCliente = clienteService.findClientesById(id);
		if (objCliente != null) {
			clienteService.removeCliente(id);
		} else {
			return new ResponseEntity<Clientes>(objCliente, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Clientes>(objCliente, HttpStatus.OK);
	}

}
