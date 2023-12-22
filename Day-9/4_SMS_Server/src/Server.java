import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.co.vwits.sms.model.Student;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(	
				ServerSocket s = new ServerSocket(3000);
			) 
		{
			System.out.println("Server Running Waiting for Client Request !");
			Socket clientSocket = s.accept(); // This is a Blocking call, it proceed  only if there is a client request from client 
			InputStream i = clientSocket.getInputStream();
			OutputStream o = clientSocket.getOutputStream();
			PrintWriter pw  =  new PrintWriter(o);
			
			
			Student obj = new Student();
			obj.setRollNo(1);
			obj.setName("Ram");
			/* 
			 * Convert the Student Object into JSON and send to the Client
			 * Conversion from Java Object to JSON and vice versa is common task
			 * Though this can be manually done and it is time consuming and error prone task
			 * Thats why there are so many open-source library to do this
			 * 1.Jackson -> most popural and powerful Library
			 * 2.GSON
			 * In order to use any third party library in Java code we must download the jar from internet
			 */
			ObjectMapper mapper = new ObjectMapper();
			String jsonData = mapper.writeValueAsString(obj);
			System.out.println(jsonData);
			pw.println(jsonData);
			pw.close();
			
			System.out.println("Request Recived from Client :)");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
