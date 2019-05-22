<%@ page language="java" contentType="text/html; charset=ISO-8859-1"     pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- 
http://localhost:8080/MIPGraph/ 
http://l-sjn-00559908.corp.ebay.com:8080/MIPGraph/
-->
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Mip Graphs</title>
	

	
	<link rel="Stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/jquery-ui.css"  />
	<link rel="Stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"  />
	
			
	<script type="text/javascript"  src="${pageContext.request.contextPath}/resources/js/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-ui.js"></script>			
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/json2.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/modernizr-2.8.3.min.js"></script>
	
	<script type="text/javascript" src="https://www.google.com/jsapi"></script> 
	
	
    <script type="text/javascript">
    	
		
		$(document).ready(function() {			
			
			$('#submitGraph').click(function (){				
				
				
				var startDateTime = document.getElementById('startDateTime').value;
				var endDateTime = document.getElementById('endDateTime').value;
				var feedTypes = document.getElementById('feedTypes').value;
				var sellers = document.getElementById('sellers').value;
				
				var priorityURL =  "http://l-sjn-00559908.corp.ebay.com:8080/MIPGraph/MIPGraph/mipGraphData?startDateTime="+startDateTime+"&endDateTime="+endDateTime+"&feedTypes="+feedTypes+"&sellers="+sellers;
				drawChart(priorityURL);
				
				
			});//submitGraph end
			
		})//ready end
		
		google.load("visualization", "1", {packages:["corechart", "table"]});
		
		function drawChart(priorityURL) {
			var arr = [];
			
			$.ajax({
				
				url:priorityURL,
				type:"get",
				dataType: "JSON",
				contentType:"application/json; charset=utf-8",
				mimeType:"application/json",
				
				cache:false,
				success: function(data) {
					
					$.each(data, function(index, element) {
						
						
						//console.log(" index " + index + " element " + element)
						// Creates an empty line
						 arr.push([]);
						 // Adds cols to the empty line:
						 arr[index].push( new Array(5));
						
						var mipDataStr = JSON.stringify(element);
						var mipDataObj = JSON.parse(mipDataStr);
						//console.log("index = " + index + "  mipDataStr = " + mipDataStr + " mipDataObj = " + mipDataObj);
						
						arr[index][0] = mipDataObj.hours;	
						arr[index][1] = mipDataObj.avgofRECORD_COUNT;
						arr[index][2] = mipDataObj.avgofOVERALLTIME;
						arr[index][3] = mipDataObj.avgofPROCESSINGTIME;
						
						
						//arr[index][1] = mipDataObj.count;
						//console.log ("arr " + arr + " index " + index) ; 
						
					}); // each end						
					//console.log ("arr 111111111111 " + arr ) ; 
				},error: function(data, status, er) {		
					console.log("error when calling data for Logs data = " + data + " status = " + status + " er = " +er);
				},
				complete: function (req, status) {
					
					console.log (" after complete" ) ;  
					
					var data = new google.visualization.DataTable();
	      		    data.addColumn('string', 'Hours');	
	      		  	data.addColumn('number', 'Average Of RECORD_COUNT');
	      		   	data.addColumn('number', 'Average Of OVERALLTIME');
	      		    data.addColumn('number', 'Average Of PROCESSINGTIME');
	      		    
	      		    
	      		    
	      		   data.addRows(arr);
	      		   
	      		   var options = {           
						    title: 'MIP Graphs Data',          
						    hAxis: {title: 'Hours',  titleTextStyle: {color: 'black'}}  , 
						    series:[
						                {targetAxisIndex:1},
						                {targetAxisIndex:0},
						                {targetAxisIndex:0},
						                {targetAxisIndex:0} 
						    ],
						    vAxes: {0: {logScale: true},
					            1: {logScale: false, maxValue: 2}}
						    //chartArea:{left:100,top:100, right: 100, width:1500, height:350}
						 };          
			
			 		var chart = new google.visualization.AreaChart(document.getElementById('line_top_x'));        
			  		chart.draw(data, options); 
			  		
			  		var table = new google.visualization.Table(document.getElementById('table_div'));
			        table.draw(data, {showRowNumber: true, width: '80%', height: '100%'})
			  	      
					
				}//complete end
				
				
			});//ajax call end
			
			
		} // drawChart end
    	
  </script>
  
</head>
<body>
	<br><br><br><br>
	<div class="container" align="center">
		<div> MIP Graph Data</div><br><br>
		
		<div>
			
				<table border="1" >
					<tr>
						<td>Start Date Time (ex 2016-04-17 00:00:00)</td>
						<td><input type="text" name="startDateTime" id="startDateTime"/></td>
					</tr>
					<tr>
						<td>End Date Time (ex 2016-04-17 00:00:00)</td>
						<td><input type="text" name="endDateTime" id="endDateTime"/></td>
					</tr>
					<tr>
						<td>Feed Types (comma separated ex 1,2,3 )</td>
						<td><input type="text" name="feedTypes" id="feedTypes"/></td>
					</tr>
					<tr>
						<td>Sellers (comma separated ex 5000182643, 5000004848 )</td>
						<td><input type="text" name="sellers" id="sellers"/></td>
					</tr>
					
					<tr>  
				    	<td> </td>  
				      	<td><input type="button" value="Submit" id="submitGraph" /></td>  
				    </tr>
				    
				</table>
		
		</div>
		
	</div>	
	
	<hr style=" border: solid 1px red;padding-top:10px; margin:25px auto 15px auto;clear:both" />
	<br><br>
	<div id="line_top_x"></div>
  	<br><br><br>
  	<table width="70%" align="center">
  		<tr>
  			<td><div id="table_div"></div></td>
  			
  		</tr>
  	</table>
  
</body>
</html>