import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

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
			int input = i.read();
			switch(input) {
			
			case 1 :
				System.out.println("Good Morning");
				break;
			
			case 2 :
				System.out.println("Good Afternoon");
				break;
				
			default:
				System.out.println("Not found :(");
			}
			System.out.println("Data recived from the Client is "+ input);
			System.out.println("Request Recived from Client :)");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
