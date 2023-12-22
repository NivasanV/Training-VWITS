package in.co.vwits.displayservice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "messageservice") // This name must match with name registered with Eureka server
public interface MessageServiceOpenFeignClient {
	
	@GetMapping("/api/message")
	String remoteGetMethod();
}
