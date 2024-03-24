package com.API0.demo.ExceptionStrucutre;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CutsomizedResponseException extends ResponseEntityExceptionHandler{
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorDetails> handleAllExceptions(Exception ex, WebRequest request) throws Exception{
		ErrorDetails err = new ErrorDetails(ex.getMessage(), LocalDateTime.now(), request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(err , HttpStatus.INTERNAL_SERVER_ERROR);
	}

	
}
