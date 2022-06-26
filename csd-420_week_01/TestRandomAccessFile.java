
import java.io.*;

public class TestRandomAccessFile {

	public static void main(String[] args) throws IOException {
		try ( // create a random access file
			RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw");
			) {
			// clear the file to destroy the old contents if exists
			inout.setLength(0);
			
			// write new integers to the file
			for (int i = 0; i < 200; i++)
				inout.writeInt(i);
			
			// display the current length of the file
			System.out.println("Current file length is " + inout.length());
			
			// retrieve the first number
			inout.seek(0); // move the file pointer to the beginning
			System.out.println("The first number is " + inout.readInt());
			
			
			// retrieve the second number
			inout.seek(1 * 4); // move the file pointer to the second number
			System.out.println("The second number is " + inout.readInt());
			
			// retrieve the tenth number
			inout.seek(9 * 4); // move the file pointer to the tenth number
			System.out.println("The tenth number is " + inout.readInt());
			
			// modify the eleventh number
			inout.writeInt(555);
			
			// append a new number
			inout.seek(inout.length()); // move the file pointer to the end
			inout.writeInt(999);
			
			// display the new length
			System.out.println("The new length is " + inout.length());
			
			// retrieve the new eleventh number
			inout.seek(10 * 4); // move the file pointer to the eleventh number
			System.out.println("The eleventh number is " + inout.readInt());
		}
	}
}
