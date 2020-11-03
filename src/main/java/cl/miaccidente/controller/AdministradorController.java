package cl.miaccidente.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class AdministradorController {

	private Logger registroLog = Logger.getLogger(LoginController.class);

	@GetMapping("/administrador")
	public String mostrarVistaAdministrador() {
		registroLog.info("Estamos en el portal para un usuario de tipo Administrador");
		return "VistaAdministrador";
	}

	@RequestMapping("/login/administrador/notificaratrasos")
	public String notificarAtraso(Model model, @RequestParam(name = "notificacion", required = false) String notificacion) {
		registroLog.info("Estamos en la vista para notificar atrasos");
		model.addAttribute("notificacion", notificacion);
		return "NotificarAtraso";
	}

	@RequestMapping("/administrador/btnnotificacion")
	public String alertNotificacion() {
		registroLog.info("Se notifica el atraso");
		return "redirect:/login/administrador/notificaratrasos?notificacion";
	}

	@RequestMapping("/administrador/calculoaccidentabilidad")
	public String calculoAccidentabilidad() {
		registroLog.info("Estamos en la vista para calcular accidentabilidad");
		return "CalculoAccidentabilidad";
	}
}