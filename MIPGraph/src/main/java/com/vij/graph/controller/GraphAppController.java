package com.vij.graph.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vij.graph.model.GraphRequest;

@Controller
public class GraphAppController {
	

	
	//http://l-sjn-00559908.corp.ebay.com:8080/MIPGraph/MIPGraph/mipGraph
	
		
		
		@RequestMapping("/mipGraph")
		public String   mipGraphData(@ModelAttribute GraphRequest graphRequest) {
			 return "mipGraph";
		}

}
