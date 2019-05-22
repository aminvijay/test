package com.vij.graph.services;

import java.util.List;

import com.vij.graph.model.GraphData;
import com.vij.graph.model.GraphDataNo;
import com.vij.graph.model.GraphRequest;

public interface GraphService {
	
	public List<GraphData> getGraphDataList(GraphRequest graphRequest);  
	public List<GraphDataNo> getGraphDataListNo(GraphRequest graphRequest);  

}