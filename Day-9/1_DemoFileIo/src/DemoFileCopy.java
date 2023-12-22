import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:\\Users\\DAB55DN.VW\\OneDrive - Volkswagen AG\\Documents\\Java_training\\Day-9\\1_DemoFileIo\\README.txt");
			fos = new FileOutputStream("C:\\Users\\DAB55DN.VW\\OneDrive - Volkswagen AG\\Documents\\Java_training\\Day-9\\1_DemoFileIo\\README_COPY.txt");
			
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
		finally {
			try {
				if(fis != null) {
					fis.close();
				}
				if(fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
