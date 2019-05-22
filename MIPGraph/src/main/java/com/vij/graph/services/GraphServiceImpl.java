package com.vij.graph.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vij.graph.dao.GraphDao;
import com.vij.graph.model.GraphData;
import com.vij.graph.model.GraphDataNo;
import com.vij.graph.model.GraphRequest;

public class GraphServiceImpl implements GraphService {

	@Autowired
	GraphDao graphDao;
	
	public List<GraphData> getGraphDataList(GraphRequest graphRequest) {
			 return graphDao.getGraphDataList(graphRequest);
	}
	
	public List<GraphDataNo> getGraphDataListNo(GraphRequest graphRequest) {
		 return graphDao.getGraphDataListNo(graphRequest);
	}
}
