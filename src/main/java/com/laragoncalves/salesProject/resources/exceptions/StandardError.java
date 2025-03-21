package com.laragoncalves.salesProject.resources.exceptions;

import java.time.Instant;

public class StandardError {

	 private Instant timeStamp;
	 private Integer status;
	 private String error;
	 private String messeger;
	 private String path;
	 
	 
	 public StandardError() {
		 
	 }

	 
	public StandardError(Instant timeStamp, Integer status, String error, String messeger, String path) {
		this.timeStamp = timeStamp;
		this.status = status;
		this.error = error;
		this.messeger = messeger;
		this.path = path;
	}




	public Instant getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(Instant timeStamp) {
		this.timeStamp = timeStamp;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public String getMesseger() {
		return messeger;
	}


	public void setMesseger(String messeger) {
		this.messeger = messeger;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}
	 
	 
}
