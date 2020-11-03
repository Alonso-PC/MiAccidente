package cl.miaccidente.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VistasController {

	private Logger registroLog = Logger.getLogger(LoginController.class);

	@RequestMapping("/login/clientes")
	public String vistaClientes() {
		registroLog.info("Estamos en el Portal Clientes");
		return "VistaClientes";
	}

	@RequestMapping("/login/profesionales")
	public String vistaProfesionales() {
		registroLog.info("Estamos en el Portal Profesionales");
		return "VistaProfesionales";
	}

	@RequestMapping("/login/administrador/actividades")
	public String vistaActividades() {
		return "VistaActividades";
	}

	@RequestMapping("/login/administrador/reportes")
	public String vistaReporte() {
		registroLog.info("Estamos en la Vista Reportes");
		return "VistaReportes";
	}

	@RequestMapping("/login/profesionales/casoasesoria")
	public String vistaCasoAsesoria() {
		registroLog.info("Estamos en la Vista Casos de Asesoria");
		return "VistaCasoAsesoria";
	}

}
