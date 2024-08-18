package com.mohith.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohith.dto.Prompt;
import com.mohith.response.ApiResponse;
import com.mohith.service.ChatBotService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/ai/chat")
public class ChatbotController {
	
	private final ChatBotService chatbotService;
	
	public ChatbotController(ChatBotService chatbotService)
	{
		this.chatbotService = chatbotService;
	}
	
	@PostMapping
	public ResponseEntity<ApiResponse> getCoinDetails(@RequestBody Prompt prompt) throws Exception
	{
		
		
		
		ApiResponse response = chatbotService.getCoinDetails(prompt.getPrompt());
		return new ResponseEntity<>(response , HttpStatus.OK);
	}
	
	@PostMapping("/simple")
	public ResponseEntity<String> simpleChatHandler(@RequestBody Prompt prompt) throws Exception
	{
		String response = chatbotService.simpleChat(prompt.getPrompt());
		
		
		//ApiResponse response = new ApiResponse();
		//response.setMessage(prompt.getPrompt());
		return new ResponseEntity<>(response , HttpStatus.OK);
	}

}
