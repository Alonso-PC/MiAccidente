package cl.miaccidente.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.miaccidente.modelo.Credenciales;

@Controller
public class LoginController {

	private Logger registroLog = Logger.getLogger(LoginController.class);

	@GetMapping({ "/login", "/" })
	public String Login(Model model, @RequestParam(name = "error", required = false) String error,
			@RequestParam(name = "logout", required = false) String logout) {
		registroLog.info("Estamos en el Inicio de la Página Web");
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		model.addAttribute("credenciales", new Credenciales());
		return "Login";
	}

	@PostMapping("/check")
	public String Check(@ModelAttribute(name = "credenciales") Credenciales credenciales) {
		registroLog.info("Estamos validando las credenciales del usuario de acuerdo a su rol");
		if (credenciales.getNombre().equals("administrador") && credenciales.getPass().equals("1234")) {
			return "redirect:/login/administrador";
		} else if (credenciales.getNombre().equals("profesional") && credenciales.getPass().equals("1234")) {
			return "redirect:/login/profesionales";
		} else if (credenciales.getNombre().equals("cliente") && credenciales.getPass().equals("1234")) {
			return "redirect:/login/clientes";
		} else {
			return "redirect:/login?error";
		}
	}
}