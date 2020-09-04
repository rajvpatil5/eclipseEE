package com.log.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class EmailExceptionHandler {
	
	public ResponseEntity<CustomUniqueEmailErrorMessage> handelException(DuplicateEmailException dex){
		CustomUniqueEmailErrorMessage error = new CustomUniqueEmailErrorMessage(
				HttpStatus.NOT_FOUND.value(),
				dex.getMessage(),
				System.currentTimeMillis()
				);
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		
	}
 
}
