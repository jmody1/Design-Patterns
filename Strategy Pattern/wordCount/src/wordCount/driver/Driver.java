package wordCount.driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import wordCount.modules.CountNumberOfWords;
import wordCount.modules.CounterNumberOfDistinctWords;
import wordCount.util.Logger;
import wordCount.util.Logger.DebugLevel;
import wordCount.modules.checkStrategy;
import wordCount.modules.countNumberOfCharacters;
import wordCount.modules.insertingValuesInTreeModule1;

public class Driver 
{
	static DebugLevel Driver;
	public static void main(String[] args) 
	{
		long startTime = System.currentTimeMillis();
		int iteration = Integer.parseInt(args[2]);
		String message;
		
		for(int i=1; i<=(iteration); i++)
		{
			String fileName = args[0];
			String outputFile = args[1];
			int debugLevel = Integer.parseInt(args[3]);
			
			if(args.length==4)
			{
				if(debugLevel >0 && debugLevel<=5)
				{
					insertingValuesInTreeModule1 module1 = new insertingValuesInTreeModule1();
					
					module1.fillTree(fileName);
					
					checkStrategy countWords = new CountNumberOfWords(module1);
					checkStrategy countCharacters = new countNumberOfCharacters(module1);
					checkStrategy countDistinctWords = new CounterNumberOfDistinctWords(module1);
					
					try 
					{
						PrintStream console = System.out; 
						File file = new File(outputFile);
							FileOutputStream fos = new FileOutputStream(file);
							PrintStream ps = new PrintStream(fos);
							
							System.setOut(ps);						
							countWords.check();
							countCharacters.check();
							countDistinctWords.check();
						
							System.setOut(console);	
							ps.close();
					}
					catch (FileNotFoundException e) 
					{
						e.printStackTrace();
					} 
					catch (IOException e) 
					{
						e.printStackTrace();
					}
				}
				else
					{
						message = "Third arguement should be debuglevel and its value should be between 0 and 5";
						Logger.writeMessage(message, Driver);
					}
			}
			else
			{
				message = "Number of command line arguements should be 4.";
				Logger.writeMessage(message, Driver);
				System.exit(0);				
			}
		}
		long finishTime = System.currentTimeMillis();
		long total_time = ((finishTime-startTime)/iteration);
		message = "Total time taken: "+total_time+" miliseconds";
		Logger.writeMessage(message, Driver);
	}
}
