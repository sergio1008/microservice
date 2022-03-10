package com.serbernal.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

	@GetMapping("/hola-mundo")
	public String holaMundo() {
		return "Hola mundo";
	}
}
