package com.dnb.apigatewayservice.exception;

import org.springframework.security.core.AuthenticationException;

public class JwtTokenMissingException extends AuthenticationException{
	private static final long serialVersionUID = 1L;
	public JwtTokenMissingException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	
}
