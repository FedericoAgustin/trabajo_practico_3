package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormClienteController {

	@GetMapping("/formCliente")
	public String formView() {

		return "form-cliente";
	}

}
