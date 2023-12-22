package in.co.vwits.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.vwits.model.exception.StudentNotFoundException;
import in.co.vwits.sms.model.Student;
import in.co.vwits.sms.service.StudentService;

// @Controller is used to create web controllers
// @Controller is used to create web applications
//@Controller
@RestController // @Controller + @ResponeBody = @RestController
@RequestMapping("/student")
public class StudentController {
		
	@Autowired
	private StudentService  service;
	
	//@ResponseBody
	//@RequestMapping(value = "/{rollno}", method = RequestMethod.GET) // {id} is known as path variable
	@GetMapping(value = "/{rollno}") 
	// to fetch its value spring offers annotation @pathVariable
	public Student findStudentById(@PathVariable int rollno) throws StudentNotFoundException {
		return this.service.findOneWithSubjectsLearning(rollno).get();
//		System.out.println(rollno);
//		Student s = new Student();
//		s.setRollno(1);
//		s.setName("Amit");
//		return s;	// here we are returning Student Java object but it doesn't mal=ke any sense
					
		// to client application as client application might be build in some other programming languages
		// such as angular react . Hence, this java object must be converted so it canbe understood by
		// other programming languages.
		// The most common format of exchanging the data among different application is JSON
		// Hence, this java object must be converted to JSON object
		// @ResponseBody this annotation is to instruct the spring to return whatever you returning from a method
		// as ResponseBody
		// Though it is possible to do this manual conversion but this is time consuming error prone
		//Hence, spring offers solution to this problem using the concept known as messageConverters.
		//But in order to help spring's messageConverter to this conversion we have to add appropriate
		//libraries (dependencies).
		//Most popular open source library for JAVA to JSON and JSON to JAVA conversion is: Jackson.
	}
	
	//@ResponseBody
	//@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@DeleteMapping(value = "/{rollno}")
	public void deleteById(@PathVariable int rollno) {
		this.service.deleteStudent(rollno);
	}
	
	//@ResponseBody
	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping
	public List<Student> findAll(){
		return this.service.findAllWithSubjects(); // This method call is talking to service layer which in terms talking with Database
		// which is fetching data
	}
	
	//@ResponseBody
	//@RequestMapping(value = "/{rollno}", method = RequestMethod.PUT)
	@PutMapping(value = "/{rollno}")
	public Student updateStudent(@PathVariable int rollno,@RequestBody Student studentToBeUpdated) {
		// @RequestBody this annotation is to instruct the spring whatever user is passing as body of HTTP request 
		// converted into Student object
		// While passing data via RequestBody make are JSON keys must be matching to feild namem in the
		//model class otherwise null value in passed for that field
		Student s = this.service.findOneWithSubjectsLearning(rollno).get();
		s.setName(studentToBeUpdated.getName());
		s.setPercentage(studentToBeUpdated.getPercentage());
		s.setNumberOfAttempts(studentToBeUpdated.getNumberOfAttempts());
		s.setSubjectsLearning(studentToBeUpdated.getSubjectsLearning());
		this.service.updateByRollNo(s);
		return s;
	}
	
	//@ResponseBody
	//@RequestMapping(method = RequestMethod.POST)
	@PostMapping
	public Student createStudent(@RequestBody Student studentToBeCreated) {
		this.service.save(studentToBeCreated);
		return studentToBeCreated;
	}
}




