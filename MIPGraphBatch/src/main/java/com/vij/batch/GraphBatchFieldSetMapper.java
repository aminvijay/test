package com.vij.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class GraphBatchFieldSetMapper implements FieldSetMapper<GraphBatch>{
	
	public GraphBatch mapFieldSet(FieldSet fieldSet) throws BindException {
		
		GraphBatch batch = new GraphBatch();
		
		try {
			
			try {
				batch.setMip_user_id(fieldSet.readDouble("mip_user_id"));
			}catch(Exception e) {
				System.out.println("mip_user_id Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			try {
				batch.setDts_request_id(fieldSet.readDouble("dts_request_id"));
			}catch(Exception e) {
				System.out.println("dts_request_id Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			try {
				batch.setInput_type(fieldSet.readInt("input_type"));
			}catch(Exception e) {
				System.out.println("input_type Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			try {
				batch.setFile_size(fieldSet.readDouble("file_size"));
			}catch(Exception e) {
				System.out.println("file_size Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			try {
				batch.setRecord_count(fieldSet.readDouble("record_count"));
			}catch(Exception e) {
				System.out.println("record_count Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			
			try {
				batch.setStarttime(fieldSet.readDate("starttime","MM/dd/yyyy HH:mm"));
			}catch(Exception e) {
				System.out.println("starttime Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			try {
				batch.setActualstarttime(fieldSet.readDate("actualstarttime","MM/dd/yyyy HH:mm"));
			}catch(Exception e) {
				System.out.println("actualstarttime Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			try {
				batch.setEndtime(fieldSet.readDate("endtime","MM/dd/yyyy HH:mm"));
			}catch(Exception e) {
				System.out.println("endtime Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			
			try {
				batch.setProcessingtime(fieldSet.readDouble("processingtime"));
			}catch(Exception e) {
				System.out.println("processingtime Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			
			try {
				batch.setOveralltime(fieldSet.readDouble("overalltime"));
			}catch(Exception e) {
				System.out.println("overalltime Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			try {
				batch.setTimeinreceived(fieldSet.readDouble("timeinreceived"));
			}catch(Exception e) {
				System.out.println("timeinreceived Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			try {
				batch.setTimeintransformed(fieldSet.readDouble("timeintransformed"));
			}catch(Exception e) {
				System.out.println("timeintransformed Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			try {
				batch.setTimeinsubmitted(fieldSet.readDouble("timeinsubmitted"));
			}catch(Exception e) {
				System.out.println("timeinsubmitted Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			
			try {
				batch.setTimeforreceivedwork(fieldSet.readDouble("timeforreceivedwork"));
			}catch(Exception e) {
				System.out.println("timeforreceivedwork Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			try {
				batch.setTimefortransformwork(fieldSet.readDouble("timefortransformwork"));
			}catch(Exception e) {
				System.out.println("timefortransformwork Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			try {
				batch.setTimeforsubmitwork(fieldSet.readDouble("timeforsubmitwork"));
			}catch(Exception e) {
				System.out.println("timeforsubmitwork Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			try {
				batch.setReceivetotransformtime(fieldSet.readDouble("receivetotransformtime"));
			}catch(Exception e) {
				System.out.println("receivetotransformtime Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			
			try {
				batch.setTransformtosubmittime(fieldSet.readDouble("transformtosubmittime"));
			}catch(Exception e) {
				System.out.println("transformtosubmittime Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
			}
			
			
			
		}catch(Exception e) {
			System.out.println("Exception while parsing data in GraphBatchFieldSetMapper, input data are : " + fieldSet.toString());
		}
		
		return batch;
	}

}
