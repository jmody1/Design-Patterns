

public class FileProcessorHelper {

	FileProcessor fp = new FileProcessor();
	StreetLightsContext context = new StreetLightsContext();
	String[] list = fp.readLine();{	
	for(int i=0; i<list.length; i++){
		if(list[i].equals("RED at NS")){
			context.getRedforns();
			context.getGreenforew();
		}
		else if(list[i].equals("GREEN at NS")){
			context.getGreenforns();
			context.getRedforew();
		}
		else if(list[i].equals("RED at EW")){
			context.getRedforew();
			context.getGreenforns();
		}
		else if(list[i].equals("GREEN at EW")){
			context.getGreenforew();
			context.getRedforew();
		}
	}
	}
	public FileProcessorHelper() {
		super();
	}
}
