package com.company.customerInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.customerInfo.requestDTO.CustomerRequestInfo;
import com.company.customerInfo.responseDTO.ApiResponse;
import com.company.customerInfo.service.CustomerService;


@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService CustomerSer;
	
	@PostMapping("/save")
	public ResponseEntity<ApiResponse> saveCustomerInfo(@RequestBody CustomerRequestInfo RequestInfo){
		CustomerSer.saveCustomerInfo(RequestInfo);
		ApiResponse response = new ApiResponse("success", "Data received successfully.");
		return ResponseEntity.ok(response);
	}
	
	
	
}
