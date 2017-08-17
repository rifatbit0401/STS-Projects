package com.mcc.fox.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcc.fox.model.ChatBot;

@RestController
@RequestMapping("/irchatbot")
public class IRBasedChatBotController {

	//@Autowired
	//private ChatBotRepository chatBotRepository;
	@Autowired
	private ChatBotService chatBotService;// = new ChatBotService(chatBotRepository);
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	
	@RequestMapping("/create-chatbot")
	public boolean createChatBot(String id) {
		ChatBot chatBot = new ChatBot();
		chatBot.id = id;
		return chatBotService.addChatBot(chatBot);
	}
	
}
