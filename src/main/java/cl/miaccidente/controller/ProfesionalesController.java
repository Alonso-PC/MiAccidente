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

import cl.miaccidente.entity.Profesionales;
import cl.miaccidente.service.ProfesionalesService;

@Controller
@RequestMapping("/login/gestionprofesionales")
public class ProfesionalesController {

	private Logger registroLog = Logger.getLogger(LoginController.class);

	@Autowired
	@Qualifier("profesionalesservice")
	private ProfesionalesService profesionalesService;

	@GetMapping("/formulario")
	public String formularioProfesionales(Model model, @RequestParam(name = "id", required = true) int id) {
		registroLog.info("Estamos en el formulario para agregar un profesional");
		Profesionales prof = new Profesionales();
		if (id != 0) {
			prof = profesionalesService.findProfesionalesById(id);
		}
		model.addAttribute("ListaProfesionales", prof);
		return "FormularioProfesionales";
	}

	@GetMapping("/lista")
	public ModelAndView listarProfesionales() {
		registroLog.info("Estamos en la lista de profesionales");
		ModelAndView mav = new ModelAndView("ListaProfesionales");
		mav.addObject("ListaProfesionales", profesionalesService.listarProfesionales());
		return mav;
	}

	@PostMapping("/agregar")
	public String addProfesionales(@ModelAttribute(name = "ListaProfesionales") Profesionales ListaProfesionales) {
		registroLog.info("Estamos agregando un profesional");
		profesionalesService.agregarProfesionales(ListaProfesionales);
		return "redirect:/login/gestionprofesionales/lista";
	}

	@GetMapping("/removeprofesionales")
	public ModelAndView removeProfesionales(@RequestParam(name = "id", required = true) int id) {
		registroLog.info("Estamos eliminando un profesional");
		profesionalesService.removeProfesionales(id);
		return listarProfesionales();
	}

}
