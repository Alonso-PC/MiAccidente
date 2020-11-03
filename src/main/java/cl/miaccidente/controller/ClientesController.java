package cl.miaccidente.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.miaccidente.entity.Clientes;
import cl.miaccidente.service.ClientesService;

@Controller
@RequestMapping("/login/gestionclientes")
public class ClientesController {

	private Logger registroLog = Logger.getLogger(LoginController.class);

	@Autowired
	@Qualifier("clientesservice")
	private ClientesService clientesService;

	@GetMapping("/formulario")
	public String formularioClientes(Model model, @RequestParam(name = "id", required = true) int id) {
		registroLog.info("Estamos en el formulario para agregar un cliente");
		Clientes cl = new Clientes();
		if (id != 0) {
			cl = clientesService.findClientesById(id);
		}
		model.addAttribute("ListaClientes", cl);
		return "FormularioClientes";
	}

	@GetMapping("/lista")
	public ModelAndView listarClientes() {
//		registroLog.info("Estamos en la lista de clientes");
		ModelAndView mav = new ModelAndView("ListaClientes");
		mav.addObject("ListaClientes", clientesService.listarClientes());
		return mav;
	}

	@PostMapping("/agregar")
	public String agregarClientes(@ModelAttribute(name = "ListaClientes") Clientes ListaClientes) {
		registroLog.info("Estamos agregando un cliente");
		clientesService.agregarClientes(ListaClientes);
		return "redirect:/login/gestionclientes/lista";
	}

	@GetMapping("/removecliente")
	public ModelAndView removeCliente(@RequestParam(name = "id", required = true) int id) {
		registroLog.info("Estamos eliminando un cliente");
		clientesService.removeCliente(id);
		return listarClientes();
	}

	// Listado para la vista de "Reporte Cliente"
	@GetMapping("/reporteclientes")
	public ModelAndView reporteClientes() {
		registroLog.info("Estamos en la vista reporte de clientes");
		ModelAndView mav = new ModelAndView("ReporteCliente");
		mav.addObject("ReporteCliente", clientesService.listarClientes());
		return mav;
	}

	// Listado para la vista de "Reporte Global"
	@GetMapping("/reporteglobal")
	public ModelAndView reporteGlobal() {
		registroLog.info("Estamos en la vista reporte global");
		ModelAndView mav = new ModelAndView("ReporteGlobal");
		mav.addObject("ReporteGlobal", clientesService.listarClientes());
		return mav;
	}

	// Listado para la vista de "Calculo de Accidentabilidad"
	@GetMapping("/calculoaccidentabilidad")
	public ModelAndView calculoAccidentabilidad() {
		registroLog.info("Estamos en la vista calcular accidentabilidad");
		ModelAndView mav = new ModelAndView("CalculoAccidentabilidad");
		mav.addObject("CalculoAccidentabilidad", clientesService.listarClientes());
		return mav;
	}

	@GetMapping("/revisarclientes")
	public ModelAndView revisarClientes() {
		registroLog.info("Estamos en la vista revisar clientes");
		ModelAndView mav = new ModelAndView("RevisarClientes");
		mav.addObject("RevisarClientes", clientesService.listarClientes());
		return mav;
	}

}