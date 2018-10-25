package wordCount.util;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;
import wordCount.util.Logger;
import wordCount.util.Logger.DebugLevel;

public class FileProcessor 
{
	/**
	 * this method is used to read the input file and return each value
	 * one by one. In this method, I also take care of the exception 
	 * handling
	 */
	
	Scanner input;
	int i=1;
	String line;
	DebugLevel FILE_PROCESSOR;
	String message;
	
	public String ReadLine(String file_name) throws FileNotFoundException 
	{
		String file = file_name;
		if (i == 1) 
		{

			if(new File(file).isFile())
			{
				input = new Scanner(new File(file));
				i++;
			}
			else
			{
				message="Arguement 1 should be input file";
				Logger.writeMessage(message, FILE_PROCESSOR);
				System.exit(0);
			}
		}
			try 
			{
				if (input.hasNext()) 
					{
						String line;
						line = input.next();
						return line;
					}
			}
			catch (Exception e) 
			{
				message = "File is empty!!";
				Logger.writeMessage(message, FILE_PROCESSOR);
				System.exit(0);
			}
		
		
		return null;
	}
	public void close()
	{
		this.i = 1;
		input.close();
	}
}
