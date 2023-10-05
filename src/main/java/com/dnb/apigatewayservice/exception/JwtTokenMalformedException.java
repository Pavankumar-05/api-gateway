package com.dnb.apigatewayservice.exception;

import org.springframework.security.core.AuthenticationException;

public class JwtTokenMalformedException extends AuthenticationException {

	private static final long serialVersionUID = 8871406460537189503L;
	
	public JwtTokenMalformedException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	
}
