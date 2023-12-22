import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileCopyWithARM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(	FileInputStream fis = new FileInputStream("C:\\Users\\DAB55DN.VW\\OneDrive - Volkswagen AG\\Documents\\Java_training\\Day-9\\1_DemoFileIo\\README.txt");
				FileOutputStream fos = new FileOutputStream("C:\\Users\\DAB55DN.VW\\OneDrive - Volkswagen AG\\Documents\\Java_training\\Day-9\\1_DemoFileIo\\README_COPY2.txt");
				) {

			int data = fis.read();
			while(data != -1) {
				fos.write(data);
				data = fis.read();
			}
			System.out.println("File Copied !!!");
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
