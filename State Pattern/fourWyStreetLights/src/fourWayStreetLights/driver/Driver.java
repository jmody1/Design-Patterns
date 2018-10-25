

public class Driver {

	static String fileName;
	static String outputFileName;
	public static void main(String[] args) {
		int num = 0;
		try{
			args[0] = fileName;
			args[1] = outputFileName;
			try{
				num = Integer.parseInt(args[2]);
			}
			catch(NumberFormatException nfe){
				System.err.println("Third argument should be a number");
				System.exit(1);
			}
		}
		catch(Exception e){
			System.err.println("Incorrect number of arguments");
			System.exit(1);
		}
		new FileProcessorHelper();
		new Results(outputFileName);

	}

}
