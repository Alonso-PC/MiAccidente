package cl.miaccidente.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login/profesionales")
public class VistaProfesionalesController {

	private Logger registroLog = Logger.getLogger(LoginController.class);

	@RequestMapping("/asesoria")
	public String crearCasoAsesoria() {
		registroLog.info("Estamos la vista para crear casos de asesoria");
		return "CrearCasoAsesoria";
	}

	@RequestMapping("/asesoria/ingresarasesoria")
	public String ingresarAsesoria() {
		registroLog.info("Estamos la vista para ingresar asesoria");
		return "IngresarAsesoria";
	}

	@RequestMapping("/asesoria/crearcapacitacion")
	public String crearCapacitacion() {
		registroLog.info("Estamos la vista para crear capacitación");
		return "CrearCapacitacion";
	}

	@RequestMapping("/asesoria/actividadterreno")
	public String listaActividadTerreno() {
		registroLog.info("Estamos la vista para ingresar actividad de terreno");
		return "ListaActividadTerreno";
	}
}