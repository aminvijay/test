package com.vij.graph.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vij.graph.jdbc.GraphDataMapper;
import com.vij.graph.jdbc.GraphDataMapperNo;
import com.vij.graph.model.GraphData;
import com.vij.graph.model.GraphDataNo;
import com.vij.graph.model.GraphRequest;

public class GraphDaoImpl implements GraphDao {
	
	@Autowired
	DataSource dataSource;

	public List<GraphData> getGraphDataList(GraphRequest graphRequest) {
		
		
		/*String sql = "select count(1) as Count,  avg(m.PROCESSINGTIME) as AVGofPROCESSINGTIME, avg(m.OVERALLTIME) as AVGofOVERALLTIME, "
		 		+ "avg(m.RECORD_COUNT) as AVGofRECORD_COUNT, SUBSTRING(date_format( m.starttime, '%Y%m%d-%H' ),10,11) as Hours from graph.mipdata m "
		 		+ "  where m.starttime >= '2016-04-17 00:00:00' and m.starttime <= '2016-04-17 24:00:00'  and m.mip_user_id in( 5000008560 )"
		 		+ " GROUP BY SUBSTRING(date_format( m.starttime, '%Y%m%d-%H' ),10,11) ";  */
		
		StringBuilder sqlFinal = new StringBuilder();
		
		sqlFinal.append("select count(1) as Count,  avg(m.PROCESSINGTIME) as AVGofPROCESSINGTIME, avg(m.OVERALLTIME) as AVGofOVERALLTIME, "
		 		+ " avg(m.RECORD_COUNT) as AVGofRECORD_COUNT, SUBSTRING(date_format( m.starttime, '%Y%m%d-%H' ),1,11) as Hours from graph.mipdata m  where m.starttime >= '" );
		
		sqlFinal.append(graphRequest.getStartDateTime() + "' and m.starttime <= '");
		sqlFinal.append(graphRequest.getEndDateTime() + "'");		
		
		//also need to check and condition for MIP_USER_ID and INPUT_TYPE
		if(graphRequest.getFeedTypes() != null && graphRequest.getFeedTypes().trim().length() > 0 && graphRequest.getSellers() != null && graphRequest.getSellers().trim().length() > 0) {
			
			sqlFinal.append("   and m.mip_user_id in(  " + graphRequest.getSellers() + " ) ");
			sqlFinal.append("   and m.INPUT_TYPE in(  " + graphRequest.getFeedTypes() + " ) ");
		} else if(graphRequest.getFeedTypes() != null && graphRequest.getFeedTypes().trim().length() > 0) {
			// check for INPUT_TYPE
			sqlFinal.append("   and m.INPUT_TYPE in(  " + graphRequest.getFeedTypes() + " ) ");
		} else if(graphRequest.getSellers() != null && graphRequest.getSellers().trim().length() > 0) {
			// check for mip_user_id
			sqlFinal.append("   and m.mip_user_id in(  " + graphRequest.getSellers() + " ) ");
		}
		
		sqlFinal.append(" GROUP BY SUBSTRING(date_format( m.starttime, '%Y%m%d-%H' ),1,11) " );
		
		System.out.println(" sqlFinal = " + sqlFinal.toString());
		
		
		
		List<GraphData> list = new ArrayList<GraphData>(); 
		 
		
		 
		 JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
		 list = jdbcTemplate.query(sqlFinal.toString(), new GraphDataMapper()); 
		 
		 return list;
	}
	
	public List<GraphDataNo> getGraphDataListNo(GraphRequest graphRequest) {
		
		
		/*String sql = "select count(1) as Count,  avg(m.PROCESSINGTIME) as AVGofPROCESSINGTIME, avg(m.OVERALLTIME) as AVGofOVERALLTIME, "
		 		+ "avg(m.RECORD_COUNT) as AVGofRECORD_COUNT, SUBSTRING(date_format( m.starttime, '%Y%m%d-%H' ),10,11) as Hours from graph.mipdata m "
		 		+ "  where m.starttime >= '2016-04-17 00:00:00' and m.starttime <= '2016-04-17 24:00:00'  and m.mip_user_id in( 5000008560 )"
		 		+ " GROUP BY SUBSTRING(date_format( m.starttime, '%Y%m%d-%H' ),10,11) ";  */
		
		StringBuilder sqlFinal = new StringBuilder();
		
		sqlFinal.append("select count(1) as Count,  avg(m.PROCESSINGTIME) as AVGofPROCESSINGTIME, avg(m.OVERALLTIME) as AVGofOVERALLTIME, "
		 		+ " avg(m.RECORD_COUNT) as AVGofRECORD_COUNT, SUBSTRING(date_format( m.starttime, '%Y%m%d-%H' ),10,11) as Hours from graph.mipdata m  where m.starttime >= '" );
		
		sqlFinal.append(graphRequest.getStartDateTime() + "' and m.starttime <= '");
		sqlFinal.append(graphRequest.getEndDateTime() + "'");		
		
		//also need to check and condition for MIP_USER_ID and INPUT_TYPE
		if(graphRequest.getFeedTypes() != null && graphRequest.getFeedTypes().trim().length() > 0 && graphRequest.getSellers() != null && graphRequest.getSellers().trim().length() > 0) {
			
			sqlFinal.append("   and m.mip_user_id in(  " + graphRequest.getSellers() + " ) ");
			sqlFinal.append("   and m.INPUT_TYPE in(  " + graphRequest.getFeedTypes() + " ) ");
		} else if(graphRequest.getFeedTypes() != null && graphRequest.getFeedTypes().trim().length() > 0) {
			// check for INPUT_TYPE
			sqlFinal.append("   and m.INPUT_TYPE in(  " + graphRequest.getFeedTypes() + " ) ");
		} else if(graphRequest.getSellers() != null && graphRequest.getSellers().trim().length() > 0) {
			// check for mip_user_id
			sqlFinal.append("   and m.mip_user_id in(  " + graphRequest.getSellers() + " ) ");
		}
		
		sqlFinal.append(" GROUP BY SUBSTRING(date_format( m.starttime, '%Y%m%d-%H' ),10,11) " );
		
		System.out.println(" getGraphDataListNo sqlFinal = " + sqlFinal.toString());
		
		
		
		List<GraphDataNo> list = new ArrayList<GraphDataNo>(); 
		 
		
		 
		 JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  
		 list = jdbcTemplate.query(sqlFinal.toString(), new GraphDataMapperNo()); 
		 
		 return list;
	}

}
