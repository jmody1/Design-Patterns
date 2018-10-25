package wordCount.util;

public class Logger 
{		
	public static enum DebugLevel 
	{ 
		Driver, FILE_PROCESSOR, Words, Characters, Distinct
    };
    static DebugLevel debugLevel;    
	public  void setDebugValue (int levelIn) 
    {
		switch (levelIn) 
    	{			
			case 5:	debugLevel = DebugLevel.Distinct; break; 
    		case 4: debugLevel = DebugLevel.Characters; break;
			case 3: debugLevel = DebugLevel.Words; break;
	    	case 2: debugLevel = DebugLevel.Driver; break;
	    	case 1: debugLevel = DebugLevel.FILE_PROCESSOR; break;
	    }
     }
	    public static void setDebugValue (DebugLevel levelIn) 
	    {
    	debugLevel = levelIn;
        }

        public static void writeMessage (String     message  ,
                                         DebugLevel levelIn ) {
    	if (levelIn == debugLevel)
    	    System.out.println(message);
        }

        public String toString() 
        {
        	return "The debug level has been set to the following " + debugLevel;
        }
}
