package lesson10;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadBiteFromFileAppl {
	public static void main(String[] args) {
		
		//slide 36, read characters from the file to the array	
		byte[] r = new byte[10];
		String fileName = "Print_file_022222_1.txt";
		FileInputStream inFile;
		try {
			inFile = new FileInputStream(fileName);
			System.out.println("Input file (" + fileName + ") was opened");
			int bytesAv = inFile.available(); // bytesAv = Bytes count in the file
			System.out.println("Bytes count in the file: " + bytesAv + " Bytes");
			int count = inFile.read(r, 0, bytesAv); // count = Bytes read from the file
			System.out.print("Bytes was readed from the file: " + count + " bytes = ");
			System.out.println(r[0] + " " + r[1] + " " + r[2]);
			inFile.close();
			System.out.println("Input stream was closed");
		} catch (IOException e) {
			System.out.println("File Read/Write Error: " + fileName);
		}
	}
}