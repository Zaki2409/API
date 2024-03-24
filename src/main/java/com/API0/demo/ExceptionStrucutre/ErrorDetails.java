package com.API0.demo.ExceptionStrucutre;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorDetails {
	private String message;
	private LocalDateTime timestamp;
	private String details;
	public String getMessage() {
		return message;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public String getDetails() {
		return details;
	}
	public ErrorDetails(String message, LocalDateTime  timestamp, String details) {
		super();
		this.message = message;
		this.timestamp = timestamp;
		this.details = details;
	}
}
