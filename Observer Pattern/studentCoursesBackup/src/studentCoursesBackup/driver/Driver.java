package studentCoursesBackup.src.studentCoursesBackup.driver;

import studentCoursesBackup.src.studentCoursesBackup.myTree.*;
import studentCoursesBackup.src.studentCoursesBackup.util.*;

public class Driver {
	
	public static void main(String[] args) {
		TreeBuilder tb = new TreeBuilder();
		
		if(args.length<5){
			System.err.println("Insufficient arguments");
			System.exit(1);
		}
		
			FileProcessor f1 = new FileProcessor(args[0]);
			Results Node_orig_result = new Results(args[2]);
			Results backup_Node1_result = new Results(args[3]);
			Results backup_Node2_result = new Results(args[4]);
			
			SubjectI Node_orig = null;
			ObserverI backup_Node_1 = null;
			ObserverI backup_Node_2 = null;
			
			while(true){
				String line = f1.readLine();
				//System.out.println(line);
				if(line == null){
					break;
				}
				try{
					String[] input = line.split(":");
					if(!input[1].matches("[A-K]")){
						System.err.println("Invalid entry");
					}
					else{
						int i = Integer.parseInt(input[0]);
						if(Node_orig == null){
							Node_orig = new Node(i, input[1]);
							backup_Node_1 = ((Node)Node_orig).clone();
							backup_Node_2 = ((Node)Node_orig).clone();
							Node_orig.register(backup_Node_1);
							Node_orig.register(backup_Node_2);
							}
						else{
							SubjectI nextNode = new Node(i, input[1]);
							ObserverI backup_NextNode_1 = ((Node)nextNode).clone();
							ObserverI backup_NextNode_2 = ((Node)nextNode).clone();
							nextNode.register(backup_NextNode_1);
							nextNode.register(backup_NextNode_2);
							Node_orig = tb.insertNode((Node)nextNode);
							backup_Node_1 = tb.insertNode((Node)backup_NextNode_1);
							backup_Node_2 = tb.insertNode((Node)backup_NextNode_2);
						}
					}
				}catch(Exception e){
					System.err.println("Invalid input");
				}
			}
			FileProcessor f2 = new FileProcessor(args[1]);
			while(true){
				String line = f2.readLine();
				if(line == null){
					break;
				}
				try{
					String[] input = line.split(":");
					if(!input[1].matches("[A-K]")){
						System.err.println("Invalid entry");
					}
					else{
						int i = Integer.parseInt(input[0]);
						if(Node_orig != null){
							((Node)Node_orig).removeCourse(input[1]);
						}
			}
			
		}catch(Exception e){
			System.err.println("Invalid input");
		}
				
	}
			if(Node_orig != null){
				((Node)Node_orig).printNodes(Node_orig_result);
				((Node)backup_Node_1).printNodes(backup_Node1_result);
				((Node)backup_Node_2).printNodes(backup_Node2_result);
				Node_orig_result.storeResultsToFile();
				backup_Node1_result.storeResultsToFile();
				backup_Node2_result.storeResultsToFile();
				}
	}

	public Driver() {
		super();
	}
}
