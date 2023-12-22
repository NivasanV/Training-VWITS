package in.co.vwits.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	// Request mapping is to map uri with method which can be used by client of the application
		@RequestMapping("/hi") // /hi is uri
		public String welcome() {
			System.out.println("Welcome");
			return "home"; // This string is view that we are returning from server to client
			/* Generally this view is JSP file but with rising popularity of client-side framework angular and react
			 * this way of building web application is declining day by day. instead
			 * REST web services are bulid on server-side, and they are consumed by client-side application such as
			 * angular and react
			 */
		}
		
		@ResponseBody
		@RequestMapping("/welcome")
		public String sayHello(){
			return "Hello"; // This string must be return as data
		}
}
