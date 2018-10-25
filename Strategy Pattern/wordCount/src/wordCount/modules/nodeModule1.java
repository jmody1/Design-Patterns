package wordCount.modules;

public class nodeModule1 
{
	String value;
	nodeModule1 left;
	nodeModule1 right;
	int countDuplicates;
	
	public nodeModule1(String value) 
	{
		this.value = value;
		right = null;
		left = null;
	}
	
	public int getCountDuplicates() 
	{
		return countDuplicates;
	}
	
	public void setCountDuplicates(int countDuplicates) 
	{
		this.countDuplicates = countDuplicates;
	}
	
}
