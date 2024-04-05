package edu.fisa.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;

@RestController
public class SimpleController {
	
	@GetMapping("getdata")
	public String get() {
		System.out.println("***********");
		return "test10";
	}
}
