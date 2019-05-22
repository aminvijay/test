package com.vij.batch;

import java.util.Date;

public class GraphBatch {
	
	
	private double mip_user_id;
	private double dts_request_id;
	private int   input_type;
	private double file_size;
	private double   record_count;
	private Date    starttime;
	private Date    actualstarttime;
	private Date    endtime;
	private double   processingtime;
	private double   overalltime;
	private double   timeinreceived;
	private double   timeintransformed;
	private double   timeinsubmitted;
	private double   timeforreceivedwork;
	private double   timefortransformwork;
	private double   timeforsubmitwork;
	private double   receivetotransformtime;
	private double   transformtosubmittime;
	
	
	public double getMip_user_id() {
		return mip_user_id;
	}
	public void setMip_user_id(double mip_user_id) {
		this.mip_user_id = mip_user_id;
	}
	public double getDts_request_id() {
		return dts_request_id;
	}
	public void setDts_request_id(double dts_request_id) {
		this.dts_request_id = dts_request_id;
	}
	public int getInput_type() {
		return input_type;
	}
	public void setInput_type(int input_type) {
		this.input_type = input_type;
	}
	public double getFile_size() {
		return file_size;
	}
	public void setFile_size(double file_size) {
		this.file_size = file_size;
	}
	public double getRecord_count() {
		return record_count;
	}
	public void setRecord_count(double record_count) {
		this.record_count = record_count;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getActualstarttime() {
		return actualstarttime;
	}
	public void setActualstarttime(Date actualstarttime) {
		this.actualstarttime = actualstarttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public double getProcessingtime() {
		return processingtime;
	}
	public void setProcessingtime(double processingtime) {
		this.processingtime = processingtime;
	}
	public double getOveralltime() {
		return overalltime;
	}
	public void setOveralltime(double overalltime) {
		this.overalltime = overalltime;
	}
	public double getTimeinreceived() {
		return timeinreceived;
	}
	public void setTimeinreceived(double timeinreceived) {
		this.timeinreceived = timeinreceived;
	}
	public double getTimeintransformed() {
		return timeintransformed;
	}
	public void setTimeintransformed(double timeintransformed) {
		this.timeintransformed = timeintransformed;
	}
	public double getTimeinsubmitted() {
		return timeinsubmitted;
	}
	public void setTimeinsubmitted(double timeinsubmitted) {
		this.timeinsubmitted = timeinsubmitted;
	}
	public double getTimeforreceivedwork() {
		return timeforreceivedwork;
	}
	public void setTimeforreceivedwork(double timeforreceivedwork) {
		this.timeforreceivedwork = timeforreceivedwork;
	}
	public double getTimefortransformwork() {
		return timefortransformwork;
	}
	public void setTimefortransformwork(double timefortransformwork) {
		this.timefortransformwork = timefortransformwork;
	}
	public double getTimeforsubmitwork() {
		return timeforsubmitwork;
	}
	public void setTimeforsubmitwork(double timeforsubmitwork) {
		this.timeforsubmitwork = timeforsubmitwork;
	}
	public double getReceivetotransformtime() {
		return receivetotransformtime;
	}
	public void setReceivetotransformtime(double receivetotransformtime) {
		this.receivetotransformtime = receivetotransformtime;
	}
	public double getTransformtosubmittime() {
		return transformtosubmittime;
	}
	public void setTransformtosubmittime(double transformtosubmittime) {
		this.transformtosubmittime = transformtosubmittime;
	}

	

}
