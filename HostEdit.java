import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HostEdit {
	// read in urls from text file and append to end of host file with 0.0.0.0 string
	// purpose: block urls using host file
	// add any unwanted websites with this program to block them


	static final String HOSTPATH = "C:/Windows/System32/drivers/etc/HOSTS";
	//static final String HOSTPATH = "E:/Downloads/HOSTS";
	public static void main(String[] hostURLs){

		BufferedReader URLReader;
		BufferedWriter hostWriter;
		// // // // // //
		try {
			hostWriter = new BufferedWriter(new FileWriter(HOSTPATH, true));
		}
		catch( IOException IOerror){
			IOerror.printStackTrace();
			System.out.println("Error opening HOSTS file for writting!");
			return;
		}
		// // // // // //
		try {
			URLReader = new BufferedReader(new FileReader("addTheseURLs.txt"));
		}
		catch (IOException readError){
			readError.printStackTrace();
			System.out.println("Error opening URL file for reading!");
			return;
		}

		String currentLine;
		try {
			currentLine = URLReader.readLine();
			while(currentLine != null){
				String lineToAdd = "\n"+ "0.0.0.0 " + currentLine;
				System.out.println(lineToAdd);
				hostWriter.write(lineToAdd);
				currentLine = URLReader.readLine();
			}
			
			hostWriter.close();
			URLReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error reading URLs or writting to HOST file");
		}

	}

}
