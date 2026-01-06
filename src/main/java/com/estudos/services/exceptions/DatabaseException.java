package com.estudos.services.exceptions;

import org.springframework.dao.DataIntegrityViolationException;

public class DatabaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DatabaseException(DataIntegrityViolationException e) {
		super(e);
	}
}
