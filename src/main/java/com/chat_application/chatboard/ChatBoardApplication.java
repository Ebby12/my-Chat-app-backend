package com.chat_application.chatboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//These lines import the necessary classes from the Spring Boot framework.

@SpringBootApplication

//This annotation is used to indicate that the class is a Spring Boot application.
// It combines several annotations that are commonly used together,
// including @Configuration, @EnableAutoConfiguration, and @ComponentScan.
public class ChatBoardApplication {

	//This class serves as the entry point for the application.

	//The main method is the starting point of the application. It uses the SpringApplication.run method to launch
	// the Spring Boot application
	// and pass the ChatBoardApplication class as the main class.

	public static void main(String[] args) {
		SpringApplication.run(ChatBoardApplication.class, args);
	}

}
