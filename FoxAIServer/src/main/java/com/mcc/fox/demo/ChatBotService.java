package com.mcc.fox.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mcc.fox.model.ChatBot;

//@Configurable
//@Component
@Service
public class ChatBotService {

	@Autowired
	private ChatBotRepository chatBotRepository;
	
	/*public ChatBotService(ChatBotRepository chatBotRepository) {
		//this.chatBotRepository = chatBotRepository;
	}*/

	public boolean addChatBot(ChatBot chatBot) {
		chatBot = chatBotRepository.save(chatBot);
		if ( chatBot != null) {
			return true;
		} else {
			return false;
		}
	}

	public ChatBot getChatBot(String id) {
		return chatBotRepository.findById(id);
	}
}
