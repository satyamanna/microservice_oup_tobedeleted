package com.authentication.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.model.JWTRequest;
import com.authentication.model.JWTResponse;

@RestController
public class AuthenticateUser {

	
	
   @RequestMapping (value =" /authenticate"  , method =  RequestMethod.POST )
	public <T> ResponseEntity<T>  getAuthenticate(HttpServletRequest httpRequest) {
		JWTRequest  request =  new JWTRequest("abcd")  ;
		return (ResponseEntity<T>) ResponseEntity.ok(request) ;
		
		
	}
   @RequestMapping (value ="/authenticate123"  , method =  RequestMethod.GET , produces  = {"application/json","application/xml"})
   public JWTResponse getResponse()  {
	   JWTResponse response  = new JWTResponse("12346789")  ;
	   return response ;
   }
   @RequestMapping({ "/hello" })
   public String firstPage() {
   return "Hello World";
   }
	
}
