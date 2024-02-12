package org.nadim.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageAPI {
	
	@GetMapping("/get")
	public String getMessage() {
		return "Welcome to Admin server";
	}
}
