package lesson10;

import java.io.FileOutputStream;
import java.io.IOException;

public class PrintBiteToFileAppl {
	public static void main(String[] args) {
		
//slide 35, write characters from the array to the file		
		byte[] w = { 48, 49, 50};
//		byte[] w = { -64, 1, 64};
		String fileName = "Print_file_022222_1.txt";
		FileOutputStream outFile;
		try {
			outFile = new FileOutputStream(fileName);
			System.out.println("Output file (" + fileName + ") was opened");
			outFile.write(w);
			System.out.println("Saved: " + w.length + " bytes to the file = " + w[0] + " " + w[1] + " " + w[2]);
			outFile.close();
			System.out.println("Output stream was closed");
		} catch (IOException e) {
			System.out.println("File Write Error: " + fileName);
		}
	}
}
