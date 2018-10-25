package studentCoursesBackup.src.studentCoursesBackup.util;

import java.util.ArrayList;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {

	private ArrayList<String> results;
	private FileProcessor fp;

	/**
	 * Default constructor
	 */
	public Results(){
		results = new ArrayList<String>();
		fp = new FileProcessor();
	}

	public Results(String output) {
		results = new ArrayList<String>();
		fp = new FileProcessor();
	}

	/** 
	 *	Store a new string in the arraylist
	 *
	 *	@param result - The string that we want to store 
	 */
	public void storeResult(String result){
		results.add(result);
	}

	/**
	 *	Print all the values in the results to stdout
	 */
	public void print(){
		System.out.println("\n\nResults:");
		for(int i = 0; i < results.size(); ++i){
			System.out.println(results.get(i));
		}
	}

	/**
	*	Method to display output on screen
	*	
	*	@param s - The string to print
	*/
	public void writeToStdout(String s){
		System.out.println(s);
	}

	/**
	 * method to write output to a file
	 */
	@Override
	public void writeToFile(String s) {
		if(fp != null){
			fp.writeLine(s);
		}
		else{
			System.err.println("Error writing to File");
		}
	}
	
	public void storeResultsToFile(){
		for(String line: results){
			writeToFile(line);
			}
	}
	
	public ArrayList<String> getResults(){
		return results;
	}
	
	
	@Override
	public String toString(){
		String content = "";
		for(String result : results){
			content += result;
		}
		return content;
	}
}
