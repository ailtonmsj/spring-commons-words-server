package br.com.spring.commons.words.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.commons.words.domain.Word;

@RestController
public class WordController {
	
	private Random random = new Random();
	
	@Value("${words}")
	private String[] words;
	
	@Value("${spring.profiles}")
	private String serviceName;
	
	@GetMapping("/serviceName")
	public String isAlive() {
		return "IS ALIVE: " + serviceName;
	}
	
	@GetMapping("/")
	public @ResponseBody Word getWord() {
		
		return new Word(words[random.nextInt(words.length)]);
	}
}
