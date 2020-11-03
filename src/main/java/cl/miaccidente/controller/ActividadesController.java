package cl.miaccidente.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import cl.miaccidente.service.ActividadesService;

@Controller
@RequestMapping("/login/administrador")
public class ActividadesController {

	private Logger registroLog = Logger.getLogger(LoginController.class);

	@Autowired
	@Qualifier("actividadesservice")
	private ActividadesService actividadesService;

	@GetMapping("/listaractividades")
	public ModelAndView Actividades() {
		registroLog.info("Estamos en la vista de actividades del administrador");
		ModelAndView mav = new ModelAndView("ListaActividades");
		mav.addObject("actividades", actividadesService.listarActividades());
		return mav;
	}

}