package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		
		return "Hello, World!";
	}
	
	@RequestMapping("/Gustavo")
	public @ResponseBody String greetingGustavo() {
	return "Olá, Gustavo Medeiros!";
	}
	
	@RequestMapping("/BomDia")
	public @ResponseBody String greetingBD() {
	return "Olá, Bom dia para você!";
	}
	
	@RequestMapping("/BoaTarde")
	public @ResponseBody String greetingBT() {
	return "Olá, Boa Tarde para você!";
	}


	@RequestMapping("/BoaNoite")
	public @ResponseBody String greetingBN() {
	return "Olá, Boa Noite para você!";
	}

	@RequestMapping("/hotfix")
	public @ResponseBody String greetingHotfix() {
	return "Isso é um hotfix!";
	}
}