package com.helloword2.hello2.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class Hello2Controller {
	@GetMapping
	public String hello()
	{
			return "Objetivo da semana: aprender teoria e pratica de Spring Boot";
	}

}
