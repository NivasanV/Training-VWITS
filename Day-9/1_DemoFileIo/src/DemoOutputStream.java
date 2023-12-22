import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:\\Users\\DAB55DN.VW\\OneDrive - Volkswagen AG\\Documents\\Java_training\\Day-9\\1_DemoFileIo\\COPY_README.txt");
			fos.write(65);	// A
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
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
