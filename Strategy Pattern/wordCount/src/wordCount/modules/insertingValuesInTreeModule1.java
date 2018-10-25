package wordCount.modules;

import java.io.FileNotFoundException;
import wordCount.util.FileProcessor;

//Reference for insertion in Tree is taken from:
//	http://www.baeldung.com/java-binary-tree

public class insertingValuesInTreeModule1 
{
	FileProcessor fp = new FileProcessor();
	String data; 
	nodeModule1 root;
	String returnString;
	int count =0 , countValues =0;
	int countChar=0;
	String temp;
	char number;
	int tempCount=0;
	
	// insertion of values in tree are done here
	
	public void fillTree(String input)
	{
		try 
		{
			while ((this.data=(fp.ReadLine(input)))!=null)
			{
				add(data);
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		fp.close();	
	}
	
	public nodeModule1 addRecursive(nodeModule1 current, String value)
	{
		if(current == null)
		{
			return new nodeModule1(value);
		}
		if(value.compareTo(current.value) < 0)
		{
			current.left = addRecursive(current.left, value);
		}
		else if (value.compareTo(current.value) > 0)
		{
			current.right = addRecursive(current.right, value);
		}
		else if (value.compareTo(current.value) == 0)
		{
			tempCount = tempCount+1;
			current.setCountDuplicates(current.getCountDuplicates() + 1);
			return current;
		}
		return current;	
	}
	
	public void add(String value)
	{
		root = addRecursive(root, value);
	}

}
