package com.vij.aja;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamController {

	@RequestMapping("/user")
	public String getUserInfo(Model model, @RequestParam(value = "name", defaultValue="guest") String name){
		
		model.addAttribute("name", name);
		
		if("admin".equals(name)){
			model.addAttribute("email", "vamin@ebay.com");
		}else {
			model.addAttribute("email", "No Email address defined");
		}
		
		return "userInfo";
	}
}
