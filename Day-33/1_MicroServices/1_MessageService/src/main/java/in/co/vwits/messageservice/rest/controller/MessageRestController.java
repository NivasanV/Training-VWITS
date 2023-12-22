package in.co.vwits.messageservice.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class MessageRestController {
	
	@Value("${server.port}")
	private String port;

	@GetMapping
	public String getMessage() {
		return "Good Morning "+ port;
	}
}
