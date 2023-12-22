package in.co.vwits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class HelloWorldApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApiApplication.class, args);
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
