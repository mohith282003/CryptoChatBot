package com.mohith.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohith.response.ApiResponse;

@RestController
public class HomeController {
	
	@GetMapping()
	public ResponseEntity<ApiResponse> Home()
	{
		
		ApiResponse response = new ApiResponse();
		response.setMessage("Welcome");
		return new ResponseEntity<>(response , HttpStatus.OK);
	}

}
