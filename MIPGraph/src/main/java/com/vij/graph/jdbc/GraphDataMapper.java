package com.vij.graph.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vij.graph.model.GraphData;

public class GraphDataMapper implements RowMapper<GraphData> {
	
	public GraphData mapRow(ResultSet rs, int line) throws SQLException {
		GraphDataExtractor graphDataExtractor = new GraphDataExtractor();
		return graphDataExtractor.extractData(rs);		
	}
}
