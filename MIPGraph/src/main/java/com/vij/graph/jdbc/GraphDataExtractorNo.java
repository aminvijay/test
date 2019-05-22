package com.vij.graph.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.vij.graph.model.GraphData;
import com.vij.graph.model.GraphDataNo;

public class GraphDataExtractorNo implements ResultSetExtractor<GraphDataNo> {
	
	public GraphDataNo extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		GraphDataNo gd = new GraphDataNo();
		
		gd.setCount(rs.getInt("Count"));
		gd.setAvgofPROCESSINGTIME(rs.getDouble("AVGofPROCESSINGTIME"));
		gd.setAvgofOVERALLTIME(rs.getDouble("AVGofOVERALLTIME"));
		gd.setAvgofRECORD_COUNT(rs.getDouble("AVGofRECORD_COUNT"));
		gd.setHours(rs.getInt("Hours"));
		
		return gd;
	}

}
