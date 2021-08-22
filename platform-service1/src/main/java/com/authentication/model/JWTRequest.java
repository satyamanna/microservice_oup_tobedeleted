package com.authentication.model;

import java.io.Serializable;

public class JWTRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName  ;
	//private String passwrd  ; 
	
	public JWTRequest(String userName) {
		super();
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
	
	
	
	
}
