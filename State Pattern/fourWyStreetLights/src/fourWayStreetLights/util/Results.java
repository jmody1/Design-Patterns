

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Results implements FileDisplayInterface {

	private String output = null;
	private String s1;
	private FileWriter fileWriter = null;
	private BufferedWriter bufferedWriter = null;
	
	
	
	/**
	 * method to write to file
	 */
	@Override
	public void writeToFile(String s) {
		try{
			fileWriter = new FileWriter(output);
		    bufferedWriter = new BufferedWriter(fileWriter);
		    bufferedWriter.write(this.getResults());
		}catch(IOException e){
		    e.printStackTrace();
		}finally{
		    try{
			bufferedWriter.close();
			fileWriter.close();
		    }catch(IOException f){
			f.printStackTrace();
		    }
		}
	}

	/**
	 * Parameterised constructor for Results class
	 * @param output
	 */
	public Results(String output) {
		super();
		s1 = "";
		this.output = output;
	}
	
	public String getResults(){
		return this.s1;
	}
}