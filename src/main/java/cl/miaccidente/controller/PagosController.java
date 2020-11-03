package cl.miaccidente.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.miaccidente.service.PagosService;

@Controller
@RequestMapping("/login/administrador")
public class PagosController {

	private Logger registroLog = Logger.getLogger(LoginController.class);

	@Autowired
	@Qualifier("pagosservice")
	private PagosService pagosService;

	@GetMapping("/controldepago")
	public ModelAndView listarPagos() {
		registroLog.info("Estamos en la lista de pagos");
		ModelAndView mav = new ModelAndView("ListaPagos");
		mav.addObject("pagos", pagosService.listarPagos());
		return mav;
	}

}