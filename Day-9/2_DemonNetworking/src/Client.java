import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(	Scanner sc = new Scanner(System.in);
				//Socket s = new Socket("localhost",3000);
				Socket s = new Socket("127.0.0.1",3000);
			) 
		{
			
			OutputStream os = s.getOutputStream();
			System.out.println("Enter number to get response from Server: ");
			os.write(sc.nextInt());
			System.out.println("Request from client");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
