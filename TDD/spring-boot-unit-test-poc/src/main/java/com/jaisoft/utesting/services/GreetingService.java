package com.jaisoft.junit.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	public String helloWorld() {
		return "Hola Mundo";
	}

}
