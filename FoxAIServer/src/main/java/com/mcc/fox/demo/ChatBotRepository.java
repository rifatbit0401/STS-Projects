package com.mcc.fox.demo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.mcc.fox.model.ChatBot;

@Component
public interface ChatBotRepository extends CrudRepository<ChatBot, Long>{

	public ChatBot findById(String id);
}
