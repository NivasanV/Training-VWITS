package in.co.vwits.displayservice.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/display")
public class DisplayRestController {

	@Autowired
	private RestTemplate rt;
	
	@GetMapping
	public String getMessage() {
		// make a REST call to messages service and fetch the message
		
		//RestTemplate rt = new RestTemplate();
		// in following rest call we have hard coded IP address and PORT number which leads to
		//tight coupling as it is very common in MicroServices architecture to run multiple instances
		//of same MicroServices on different IP and PORT
		// In Order to remove this Hard coding instead of using IP and PORT, we should use
		//following approach
		// 1. Each MicroService must be assigned a unique name
		// 2. Each MicroService must register itself with the unique name to "ServiceRegistry"
		// 3. Each MicroService then will be access via unique name
		// This process of Registering and discover of MicroService in known as common pattern
		// known as SeviceDiscovry and Registry
		// One of the most popular implementation of pattern is EUsREKA from NETFLIX
		// How to implement?
		//String msg = rt.getForObject("http://localhost:8080/api/message", String.class);
		String msg = rt.getForObject("http://messageservice/api/message", String.class);
		
		return msg;
	}
	
}
