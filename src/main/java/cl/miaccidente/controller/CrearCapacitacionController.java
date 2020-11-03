package cl.miaccidente.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.miaccidente.entity.CrearCapacitacion;
import cl.miaccidente.service.CrearCapacitacionService;

@Controller
@RequestMapping("/login/profesionales/asesoria")
public class CrearCapacitacionController {

	private Logger registroLog = Logger.getLogger(LoginController.class);

	@Autowired
	@Qualifier("crearcapacitacionservice")
	private CrearCapacitacionService crearCapacitacionService;

	@PostMapping("/crear")
	public String crearCapacitacion(@ModelAttribute(name = "CrearCapacitacion") CrearCapacitacion CrearCapacitacion) {
		registroLog.info("Estamos creando una capacitación en la base de datos");
		crearCapacitacionService.crearCapacitacion(CrearCapacitacion);
		return "redirect:/login/profesionales/asesoria/crearcapacitacion";
	}

}