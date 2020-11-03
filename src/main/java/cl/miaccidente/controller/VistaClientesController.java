package cl.miaccidente.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.log4j.Logger;

@Controller
@RequestMapping("/login/clientes")
public class VistaClientesController {

	private Logger registroLog = Logger.getLogger(LoginController.class);

	/** Reporte de Accidente **/

	@RequestMapping("/reportaraccidente")
	public String reportarAccidente(Model model,
			@RequestParam(name = "ingresoacc", required = false) String ingresoAcc) {
		registroLog.info("Estamos en la vista para reportar un accidente");
		model.addAttribute("ingresoacc", ingresoAcc);
		return "ReportarAccidente";
	}

	@RequestMapping("/btnacc")
	public String alertAccidente() {
		registroLog.info("Se reporto el accidente");
		return "redirect:/login/clientes/reportaraccidente?ingresoacc";
	}

	/** Solicitud Asesoría **/

	@RequestMapping("/solicitarasesoria")
	public String solicitarAsesoria(Model model,
			@RequestParam(name = "solicitudasesoria", required = false) String solicitudAsesoria) {
		registroLog.info("Estamos en la vista para solicitar una asesoria");
		model.addAttribute("solicitudasesoria", solicitudAsesoria);
		return "SolicitarAsesoria";
	}

	@RequestMapping("/btnasesoria")
	public String avisoAsesoria() {
		registroLog.info("Se ingreso la asesoria");
		return "redirect:/login/clientes/solicitarasesoria?solicitudasesoria";
	}

}
