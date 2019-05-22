package com.vij.graph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vij.graph.model.GraphData;
import com.vij.graph.model.GraphDataNo;
import com.vij.graph.model.GraphRequest;
import com.vij.graph.services.GraphService;

@RestController
public class GraphRestController {
	
	@Autowired
	GraphService graphService;
	
	@RequestMapping(value = "/mipGraphData", method = RequestMethod.GET,headers="Accept=application/json")  
	public List<GraphData> getGraphData(GraphRequest graphRequest)   {  
		
		/*System.out.println("in GraphRestController startDateTime = " + graphRequest.getStartDateTime() );
		System.out.println("in GraphRestController endDateTime = " + graphRequest.getEndDateTime());
		System.out.println("in GraphRestController feedTypes = " + graphRequest.getFeedTypes() );
		System.out.println("in GraphRestController sellers = " + graphRequest.getSellers() );*/
		
		return graphService.getGraphDataList(graphRequest);  
	}	
	
	@RequestMapping(value = "/mipGraphDataNo", method = RequestMethod.GET,headers="Accept=application/json")  
	public List<GraphDataNo> getGraphDataNo(GraphRequest graphRequest)   {  
		
		/*System.out.println("in GraphRestController startDateTime = " + graphRequest.getStartDateTime() );
		System.out.println("in GraphRestController endDateTime = " + graphRequest.getEndDateTime());
		System.out.println("in GraphRestController feedTypes = " + graphRequest.getFeedTypes() );
		System.out.println("in GraphRestController sellers = " + graphRequest.getSellers() );*/
		
		return graphService.getGraphDataListNo(graphRequest);  
	}	

}
