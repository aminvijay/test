package com.vij.graph.model;

public class GraphRequest {
	
	private String startDateTime;
	private String endDateTime;
	private String feedTypes;
	private String sellers;
	
	public String getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}
	public String getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(String endDateTime) {
		this.endDateTime = endDateTime;
	}
	public String getFeedTypes() {
		return feedTypes;
	}
	public void setFeedTypes(String feedTypes) {
		this.feedTypes = feedTypes;
	}
	public String getSellers() {
		return sellers;
	}
	public void setSellers(String sellers) {
		this.sellers = sellers;
	}

}
