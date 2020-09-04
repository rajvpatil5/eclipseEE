package com.log.rest;

public class DuplicateEmailException extends RuntimeException {

	public DuplicateEmailException() {
		super();

	}

	public DuplicateEmailException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public DuplicateEmailException(String message, Throwable cause) {
		super(message, cause);
	}

	public DuplicateEmailException(String message) {
		super(message);
	}

	public DuplicateEmailException(Throwable cause) {
		super(cause);
	}

}
