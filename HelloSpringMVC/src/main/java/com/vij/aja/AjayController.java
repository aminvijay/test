package com.vij.aja;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AjayController {
	//http://localhost:8080/HelloSpringMVC/vijay/ajay
	@RequestMapping("/ajay")
	public String hiAjay(Model model) {
		model.addAttribute("nik", "Hello Ajay how are you");
		return "ajayamin";
	}
	

}
