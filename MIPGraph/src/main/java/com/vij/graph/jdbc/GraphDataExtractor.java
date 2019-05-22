package com.vij.graph.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.vij.graph.model.GraphData;

public class GraphDataExtractor implements ResultSetExtractor<GraphData> {
	
	public GraphData extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		GraphData gd = new GraphData();
		
		gd.setCount(rs.getInt("Count"));
		gd.setAvgofPROCESSINGTIME(rs.getDouble("AVGofPROCESSINGTIME"));
		gd.setAvgofOVERALLTIME(rs.getDouble("AVGofOVERALLTIME"));
		gd.setAvgofRECORD_COUNT(rs.getDouble("AVGofRECORD_COUNT"));
		gd.setHours(rs.getString("Hours"));
		
		return gd;
	}

}
