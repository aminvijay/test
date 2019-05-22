package com.vij.graph.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vij.graph.model.GraphData;
import com.vij.graph.model.GraphDataNo;

public class GraphDataMapperNo implements RowMapper<GraphDataNo> {
	
	public GraphDataNo mapRow(ResultSet rs, int line) throws SQLException {
		GraphDataExtractorNo graphDataExtractorNo = new GraphDataExtractorNo();
		return graphDataExtractorNo.extractData(rs);		
	}
}
