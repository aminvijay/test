package com.vij.aja;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectExampleController {

	@RequestMapping(value ="/redir", method=RequestMethod.GET)
	public String authorInfo(Model model) {
		return "redirect:/vijay/amin";
	}
}
