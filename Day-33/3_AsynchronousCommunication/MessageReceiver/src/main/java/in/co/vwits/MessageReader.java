package in.co.vwits;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReader {

	// this method is responsible fetching the method from queue
	@JmsListener(destination = "test") // here test is your queue name
	public void readMessage(String message) {
		System.out.println(message);
	}
}
