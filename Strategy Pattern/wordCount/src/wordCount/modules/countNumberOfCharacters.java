package wordCount.modules;

import wordCount.util.Logger;
import wordCount.util.Logger.DebugLevel;

public class countNumberOfCharacters implements checkStrategy
{
	insertingValuesInTreeModule1 module1;
	int countChar=0;
	String temp;
	char number;
	DebugLevel Characters;
	String message;
	
	public countNumberOfCharacters(insertingValuesInTreeModule1 module12) 
	{
		module1 = module12;
	}
	
	@Override
	public void check() 
	{
		countCharacters();
	}
	public void countCharacters()
	{
		temp ="";
		traverseInOrderCountCharacter(module1.root);
		message = "Number of Characters are: "+countChar;
		Logger.writeMessage(message, Characters);
	}
	
	// here we are counting the total of number of characters in the tree
	public void traverseInOrderCountCharacter(nodeModule1 root)
	{
		if(root != null)
		{
			traverseInOrderCountCharacter(root.left);
			countChar += ((root.getCountDuplicates()+1)*root.value.length()); 
			traverseInOrderCountCharacter(root.right);
		}
	}

}
