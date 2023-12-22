import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Users\\DAB55DN.VW\\OneDrive - Volkswagen AG\\Documents\\Java_training\\Day-9\\1_DemoFileIo\\README.txt");
			int data = fis.read();
			while(data != -1) {
				System.out.print((char)data);
				data = fis.read();
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
