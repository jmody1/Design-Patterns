package wordCount.util;

public class Result implements FileDisplayInterface, StdoutDisplayInterface
{

	String output="";

	@Override
	public void writeToStdout() 
	{
		output="";
	}

	@Override
	public void writeToFile() 
	{
		output="";
	}
	
}
