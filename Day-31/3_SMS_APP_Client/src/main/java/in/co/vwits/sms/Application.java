package in.co.vwits.sms;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import in.co.vwits.sms.model.Student;
import in.co.vwits.sms.model.Todo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		RestTemplate rt = new RestTemplate();
		// RestTemplate is a built-in template for consuming REST web service
		// in other words it act as a client for web server
		
		String response = rt.getForObject("https://jsonplaceholder.typicode.com/todos/10", String.class);
		System.out.println(response);
		
		Todo t = rt.getForObject("https://jsonplaceholder.typicode.com/todos/10", Todo.class);
		System.out.println(t);
		
		// write a call which fetch the data from sms API application
		Student fetchStudent = rt.getForObject("http://localhost:8080/api/student/5", Student.class);
		System.out.println(fetchStudent);
		
		// write a call insert a records into sms application
		Student insertStudent = new Student();
		insertStudent.setName("Ram");
		insertStudent.setNumberOfAttempts(3);
		insertStudent.setPercentage(69);
		insertStudent.setSubjectsLearning(Arrays.asList("Java","REST"));
		
		//rt.postForObject("http://localhost:8080/api/student", insertStudent, Student.class);
		
	}

}
