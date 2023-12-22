package in.co.vwits.displayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class DisplayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayServiceApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate get() {
		RestTemplate rt = new RestTemplate();
		return rt;
	}

}
