package com.vij.aja;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {
	
	@RequestMapping("/web/fe/{sitePrefix}/{language}/document/{id}/{naturalText}")
	public String documentView(Model  model,
			@PathVariable(value = "sitePrefix") String sitePrefix,
			@PathVariable(value = "language") String language,
			@PathVariable(value = "id") Long id,
			@PathVariable(value = "naturalText") String naturalText) {
		
		String documentName = "Java Tutorial";
		if(id == 100) {
			documentName = "Sping document";
		}
		
		model.addAttribute("sitePrefix", sitePrefix);
	       model.addAttribute("language", language);
	       model.addAttribute("id", id);
	       model.addAttribute("naturalText", naturalText);
		
		model.addAttribute("documentName", documentName);
		
		return "documentView";
		
	}
			

}
