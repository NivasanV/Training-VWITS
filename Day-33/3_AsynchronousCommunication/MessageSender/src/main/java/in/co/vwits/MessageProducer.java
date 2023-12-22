package in.co.vwits;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

	@Autowired
	private JmsTemplate jt;
	
	@PostConstruct
	void init() {
		this.sendMessage();
	}
	
	public void sendMessage() {
		// first parameter is the queue name and 
		// second parameter is the message you want to sent to the queue
		jt.convertAndSend("test", "place order");
	}
}
