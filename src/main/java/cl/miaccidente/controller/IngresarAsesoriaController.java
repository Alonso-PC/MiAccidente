package cl.miaccidente.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.miaccidente.entity.IngresarAsesoria;
import cl.miaccidente.service.IngresarAsesoriaService;

@Controller
@RequestMapping("/login/profesionales/asesoria")
public class IngresarAsesoriaController {

	private Logger registroLog = Logger.getLogger(LoginController.class);

	@Autowired
	@Qualifier("ingresarasesoriaservice")
	private IngresarAsesoriaService ingresarAsesoriaService;

	@PostMapping("/ingresar")
	public String ingresarAsesoria(@ModelAttribute(name = "IngresarAsesoria") IngresarAsesoria IngresarAsesoria) {
		registroLog.info("Estamos ingresando una asesoria en la base de datos");
		ingresarAsesoriaService.ingresarAsesoria(IngresarAsesoria);
		return "redirect:/login/profesionales/asesoria/ingresarasesoria";
	}

}