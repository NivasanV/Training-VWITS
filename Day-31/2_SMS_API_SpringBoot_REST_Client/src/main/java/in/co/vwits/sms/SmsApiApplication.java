package in.co.vwits.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SmsApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SmsApiApplication.class, args);
	}
	
	

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(SmsApiApplication.class);
	}



	// CORS Configuration
	@Bean
	public WebMvcConfigurer get() {
		WebMvcConfigurer c = new WebMvcConfigurer() {

			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("*").allowedOrigins("*");
				// TODO Need to improve this configuration
			}
			
		};
		return c;
	}
	
}
