package in.co.vwits.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/api/hello")
	public String getMessage() {
		return "Hello world from cloud server";
	}
}
