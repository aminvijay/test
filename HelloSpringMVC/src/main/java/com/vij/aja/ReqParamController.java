package com.vij.aja;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReqParamController {

	
	@RequestMapping("/u1info")	
	public String getmyUser(Model model, @RequestParam(value= "name", defaultValue = "guest") String name) {
		
		model.addAttribute("name", name);
		
		if("admin".equals(name)) {
			model.addAttribute("email", "vamin@paypal.com");
		}else{
			model.addAttribute("email", "Not defined");
		}
		
		return "u1Info";
	}
	
}
