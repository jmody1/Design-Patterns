package studentCoursesBackup.src.studentCoursesBackup.util;

import studentCoursesBackup.src.studentCoursesBackup.myTree.Node;

public class TreeBuilder {
	

	/**
	 * method to insert node into the tree
	 * @param n- node to be inserted
	 * @return null
	 */
	public Node insertNode(Node n){
		Node obj = new Node();
		TreeBuilder t = new TreeBuilder();
		if(obj.getBno()<0){
			obj.setBno(n.getBno());
			obj.setCourses(n.getCourses());
			obj.setObservers(n.getObservers());
		}
		else if(obj.getBno()> n.getBno()){
			if(obj.getLeft() == null){
				obj.setLeft(n);
			}
			else{
				obj.setLeft(t.insertNode(n));
			}
		}
		else if(obj.getBno()< n.getBno()){
			if(obj.getRight()== null){
				obj.setRight(n);
			}
			else{
				obj.setRight(t.insertNode(n));
			}
		}
		else if(obj.getBno()== n.getBno()){
			if(n.getCourses()!= null){
				for(String course: n.getCourses()){
					obj.addCourse(course);
				}
			}
		}
		return null;
	}
	
	/**
	 * method to find a particular node in the tree
	 * @param bnumber- unique id through which we find the node
	 * @return
	 */
	public TreeBuilder findNode(int bnumber){
		Node obj = new Node();
		TreeBuilder t = new TreeBuilder();
		
		if(obj.getBno() <0){
			return null;
		}
		else if(obj.getBno() == bnumber){
			return this;
		}
		else if(bnumber > obj.getBno()){
			if(obj.getRight() != null)
				return t.findNode(bnumber);
		}else if(bnumber < obj.getBno()){
			if(obj.getLeft() != null)
				return t.findNode(bnumber);
		}
		return null;
	}
	
	/**
	 * method to delete a particular course from a bnumber
	 * @param bnumber- student whose course is to be deleted
	 * @param course- course to be deleted
	 */
	public void deleteCourse(int bnumber, String course){
		Node obj = new Node();
		
		try{
			if(obj.getBno()== bnumber){
				obj.removeCourse(course);
			}
			else{
				if(bnumber>obj.getBno() && obj.getRight()!= null){
					deleteCourse(bnumber, course);
				}
				else if(bnumber<obj.getBno() && obj.getLeft()!= null){
					deleteCourse(bnumber, course);
				}
			}
		}catch(NullPointerException n){
			System.err.println("Cannot delete the course");
			n.printStackTrace();
		}
	}
	
}
