package wordCount.modules;

import wordCount.util.Logger;
import wordCount.util.Logger.DebugLevel;

public class CounterNumberOfDistinctWords implements checkStrategy
{
	insertingValuesInTreeModule1 module1;
	String returnString;
	String temp;
	int countDistint;
	DebugLevel Distinct;
	String message;
	
	// here we are counting the distinct number of words in the tree
	public CounterNumberOfDistinctWords(insertingValuesInTreeModule1 module1) 
	{
		this.module1 = module1;
	}

	@Override
	public void check() 
	{
		countDistict();
	}
	public void countDistict()
	{
		temp ="";
		traverseInOrderCountDistinct(module1.root);
		message = "Number of Distinct words are: "+countDistint;
		//System.out.println("Number of Distinct words are: "+countDistint);
		Logger.writeMessage(message, Distinct);
	}
	public void traverseInOrderCountDistinct(nodeModule1 root)
	{
		if(root != null)
		{
			traverseInOrderCountDistinct(root.left);
			countDistint++;
			traverseInOrderCountDistinct(root.right);
		}
	}
}
