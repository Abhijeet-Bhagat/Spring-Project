package com.sboot.entity;

public class DTOclass {
	
	private String userName = "Something";
	private String crushName = "Something";
	//String result;
	
	public String getUserName() {
		return userName;
	}
	
	
	
	public DTOclass() {
		
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	@Override
	public String toString() {
		return "DTOclass [userName=" + userName + ", crushName=" + crushName + "]";
	}
	
	
}
