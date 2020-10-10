package com.conversion.exception;

import com.conversion.constant.ResponseStatus;

public class ConversionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ResponseStatus status;
	private String message;

	public ConversionException(ResponseStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
