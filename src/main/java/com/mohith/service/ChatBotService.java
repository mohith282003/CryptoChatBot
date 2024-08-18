package com.mohith.service;

import com.mohith.response.ApiResponse;

public interface ChatBotService {
	
	ApiResponse getCoinDetails(String prompt) throws Exception;
	
	String simpleChat(String prompt);

}
