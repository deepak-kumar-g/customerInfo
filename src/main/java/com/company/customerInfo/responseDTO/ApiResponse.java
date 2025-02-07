package com.company.customerInfo.responseDTO;

public class ApiResponse {
	
	private String status;
	private String message;
	
	
	public ApiResponse(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	
	
	public String getStatus() {
		return status;
	}
	public String getMessage() {
		return message;
	}
}
