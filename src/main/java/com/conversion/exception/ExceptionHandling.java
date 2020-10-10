package com.conversion.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.conversion.constant.ResponseStatus;
import com.conversion.webapp.response.ConversionExceptionResponse;

@RestControllerAdvice
public class ExceptionHandling extends RuntimeException {

	private static final long serialVersionUID = -5717071995416343035L;

	@ExceptionHandler(value = ConversionException.class)
	public ConversionExceptionResponse setPoliticalCampException(HttpServletRequest request,
			HttpServletResponse response, ConversionException exception) {
		ConversionExceptionResponse res = new ConversionExceptionResponse();
		res.setStatus(exception.getStatus());
		res.setMessage(exception.getMessage());
		response.setContentType("application/json");
		return res;
	}

	@ExceptionHandler(value = Exception.class)
	public ConversionExceptionResponse setPoliticalCampException(HttpServletRequest request,
			HttpServletResponse response, Exception exception) {
		ConversionExceptionResponse res = new ConversionExceptionResponse();
		res.setStatus(ResponseStatus.ERROR);
		res.setMessage(exception.getMessage());
		response.setContentType("application/json");
		return res;
	}
}
