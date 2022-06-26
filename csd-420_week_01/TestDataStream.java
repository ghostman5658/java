
import java.io.*;

public class TestDataStream {
	public static void main(String[] args) throws IOException {
		try ( // create an output stream for file temp.dat
		DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
		) {
			// write student test scores to the file
			output.writeUTF("John"); 
			output.writeDouble(85.5);
			output.writeUTF("Susan");
			output.writeDouble(185.5);
			output.writeUTF("Kim");
			output.writeDouble(105.25);
		}
		
		try ( // create an input stream for file temp.dat
		DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
		) {
			// read student test scores from the file
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
		}
	}
}
 