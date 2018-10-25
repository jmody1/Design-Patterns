package studentCoursesBackup.src.studentCoursesBackup.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.File;
import java.io.FileOutputStream;

public class FileProcessor  {

	private BufferedReader reader;
	private BufferedWriter writer;
	private String file = "C:/Users/jimitmody/Documents/Jimit/jimit_mody_assign_3/src/input.txt";
	private String file2 ="C:/Users/jimitmody/Documents/Jimit/jimit_mody_assign_3/src/output1.txt";
	File File1 = new File(file);
	File File3 = new File(file2);
	
	
	public FileProcessor(String fileIn) {
		this.file = fileIn;
		try{
			reader = new BufferedReader(new FileReader(File1));
			writer = new BufferedWriter(new FileWriter(File3));
			
	}catch(IOException e){
		System.err.println("Could not open file");
		e.printStackTrace();
		System.err.println("Exiting now");
		System.exit(1);
		}
	}

	
	
	public FileProcessor() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String readLine(){
		if(reader == null){
			System.err.println("No File found");
			return null;
		}
		try{
			String line = reader.readLine();
			return line;
		}catch(IOException e){
			System.err.println("Error reading from file");
			e.printStackTrace();
		}
		return null;
	}
	
	public void writeLine(String line) {
		if(writer == null){
			System.err.println("No files found");
			return;
		}
		try{
			writer.write(line);
			writer.newLine();
		}catch(IOException e){
			System.err.println("Error writing to File");
			e.printStackTrace();
		}
	}
}
