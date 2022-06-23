package com.skillstorm.week1.day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

class MyClass implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		// Sever connection a database
	}
	
}

public class FileIOPractice {

	public static void writeToFile(String filePath, String message) {
		// BufferedWriter
		
		// try-with-resources
		// If the try finishes or an exception occurs, the file is autoclosed
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
			writer.write(message);
			writer.flush();
		} catch (IOException e) {
			// prompt the user to provide a different file
			e.printStackTrace();
		}
		
		
		// Old way with no try-with-resources
//		BufferedWriter writer = null;
//		try {
//			writer = new BufferedWriter(new FileWriter(filePath));
//			writer.write(message);
//			
//			// Some logic
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//		} finally { // This block "always" runs
//			try {
//				writer.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (NullPointerException e) {
//				
//			}
//		}
	}
	
	public static List<String> getFileContents(String filePath) {
		List<String> fileContents = new LinkedList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//			String line = reader.readLine();
//			while (line != null) { // While there is text left to read
//				fileContents.add(line);
//				line = reader.readLine();
//			}
			for (String line = reader.readLine(); line != null; line = reader.readLine())
				fileContents.add(line);
				
		} catch (FileNotFoundException e) {
			// Prompt the user to choose a different file/display some error
			e.printStackTrace();
		} catch (IOException e) { // The closing of the file could cause an IOException
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fileContents;
	}
	
	public static void main(String[] args) {
		// IO
		// IO stands Input/Output
		
		// Relative pathing
		writeToFile("./files/myFile2.txt", "Hello World!\nAuf Wiedersehen!\n");
//		writeToFile("myFile.txt", "");
		
		List<String> fileContents = getFileContents("myFile.txt");
		System.out.println(fileContents);
	}

}
