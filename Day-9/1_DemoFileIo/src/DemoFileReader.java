import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (	FileReader fr = new FileReader("C:\\\\Users\\\\DAB55DN.VW\\\\OneDrive - Volkswagen AG\\\\Documents\\\\Java_training\\\\Day-9\\\\1_DemoFileIo\\\\README.txt");
				BufferedReader br = new BufferedReader(fr);
				)
		{
			String line = br.readLine(); // Reads One complete line
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
