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

import cl.miaccidente.entity.ActividadMejora;
import cl.miaccidente.service.ActividadMejoraService;

@Controller
@RequestMapping("/login/profesionales/asesoria")
public class ActividadMejoraController {

	private Logger registroLog = Logger.getLogger(LoginController.class);

	@Autowired
	@Qualifier("actividadmejoraservice")
	private ActividadMejoraService actividadMejoraService;

	@GetMapping("/formulario")
	public String formularioActividadMejora(Model model, @RequestParam(name = "id", required = true) int id) {
		registroLog.info("Estamos en el formulario para agregar una actividad de mejora");
		ActividadMejora am = new ActividadMejora();
		if (id != 0) {
			am = actividadMejoraService.findActividadMejoraById(id);
		}
		model.addAttribute("ListaActividadMejora", am);
		return "FormularioActividadMejora";
	}

	@GetMapping("/actividadmejora")
	public ModelAndView listarActividadMejora() {
		registroLog.info("Estamos en la lista de actividades de mejora");
		ModelAndView mav = new ModelAndView("ListaActividadMejora");
		mav.addObject("ListaActividadMejora", actividadMejoraService.listarActividadMejora());
		return mav;
	}

	@PostMapping("/agregar")
	public String agregarActividadMejora(
			@ModelAttribute(name = "ListaActividadMejora") ActividadMejora ListaActividadMejora) {
		registroLog.info("Estamos agregando una actividad de mejora");
		actividadMejoraService.agregarActividadMejora(ListaActividadMejora);
		return "redirect:/login/profesionales/asesoria/actividadmejora";
	}

	@GetMapping("/removeactividadmejora")
	public ModelAndView removeActividadMejora(@RequestParam(name = "id", required = true) int id) {
		registroLog.info("Estamos eliminando una actividad de mejora");
		actividadMejoraService.removeActividadMejora(id);
		;
		return listarActividadMejora();
	}

}
