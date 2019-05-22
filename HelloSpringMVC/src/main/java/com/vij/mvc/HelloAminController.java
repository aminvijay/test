package com.vij.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloAminController {
	
	@RequestMapping("/amin")
	public String helloAmin(Model model) {
		model.addAttribute("message", "Hello amin controller");
		
		return "helloAmin";
	}

}
