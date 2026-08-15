package com.example.FirstDeployed.error;

public class PersonNotFound extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PersonNotFound(String message) {
		super(message);
	}
	

}
