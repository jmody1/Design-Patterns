package studentCoursesBackup.src.studentCoursesBackup.myTree;

import java.util.ArrayList;

import studentCoursesBackup.src.studentCoursesBackup.util.Results;

public class Node implements ObserverI, SubjectI, Cloneable {

	private ArrayList<String> courses;
	private int bno;
	private ArrayList<ObserverI> observers;
	private Node left;
	private Node right;
	
	/**
	 * Constructor for the Node	
	 * @param courses- courses alloted to the student
	 * @param bno- B-number of the student
	 * @param observers- Observers for this class
	 * @param left- left child
	 * @param right- right child
	 */
	public Node(int bnoIn, String courseIn) {
		bno = bnoIn;
		courses = new ArrayList<String>();
		courses.add(courseIn);
	}
	
	
	
	public Node() {
		bno = 2934;
		courses = new ArrayList<String>();
		left = null;
		right = null;
		observers = null;		
	}

	/**
	 * Default constructor
	 * @param nodeIn- the current node
	 */
	public Node(Node nodeIn) {
		bno = nodeIn.getBno();
		setCourses(nodeIn.getCourses());
		setObservers(nodeIn.getObservers());
		left = null;
		right = null;
	}



	public int getBno() {
		return bno;
	}



	public void setBno(int bno) {
		this.bno = bno;
	}

	/**
	 * method to add a course to a B number
	 * @param course- subject to be added
	 */
	
	public void addCourse(String course){
		if(!filter(course)){
			if(courses == null){
				courses = new ArrayList<String>();
			}
			courses.add(course);
			notify("insert", course);
		}
		else{
			System.err.println("Course already present");
		}
	}
	
	/**
	 * method to delete a course from the B number
	 * @param course- subject to be deleted
	 */
	public void removeCourse(String course){
		if(course == null)
			return;
			try{
				for(int i=0; i<courses.size();i++){
					courses.remove(i);
					notify("delete", course);
					return;
				}
			
		}catch(NullPointerException n){
			System.err.println("Did not find course");
			n.printStackTrace();
		}
	}
	
	
	public boolean filter(String course){
		if(courses == null){
			return false;
		}
		try{
			for(int i=0; i<courses.size(); i++){
				if(courses.get(i).equals(course)){
					return true;
				}
				return false;
			}
		}
			catch(Exception e){
				System.err.println("Course not found");
				e.printStackTrace();
			
			}
		return false;
	}
	
	

	public ArrayList<String> getCourses() {
		return courses;
	}



	public ArrayList<ObserverI> getObservers() {
		return observers;
	}



	public void setObservers(ArrayList<ObserverI> observers) {
		this.observers = observers;
	}



	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}



	public Node getLeft() {
		return left;
	}



	public void setLeft(Node left) {
		this.left = left;
	}



	public Node getRight() {
		return right;
	}



	public void setRight(Node right) {
		this.right = right;
	}

	/**
	 * method to register a student for a course	
	 */
	@Override
	public void register(ObserverI obj) {
		if(observers == null){
			observers = new ArrayList<ObserverI>();
			observers.add(obj);
		}
	}

	/**
	 * method to remove a course from the observers
	 */
	@Override
	public void remove(ObserverI obj) {
		if(observers == null){
			return;
			}
		observers.remove(obj);
	}

	/**
	 * method to notify observers of any update
	 */
	@Override
	public void notify(String updateType, String update) {
		if(observers == null){
			return;
		}
		try{
			for(ObserverI obj: observers){
				obj.update(updateType, update);
			}
		}catch(NullPointerException e){
			System.err.println("Failed to notify observer");
			e.printStackTrace();
		}
	}

	/**
	 * method to perform the specific update to all the nodes
	 */
	@Override
	public void update(String updateType, String update) {
		if(updateType == "add"){
			addCourse(update);			
		}
		else if(updateType == "delete"){
			removeCourse(update);
		}
	}

	/**
	 * method to create a clone of the Node
	 */
	@Override
	public Node clone(){
		Node n = new Node(this);
		return n;
	}
	
	public void printNodes(Results r){
		try{
			if(bno >=0){
				if(left!= null){
				 r.storeResult(left.toString());
				}
				else{
					r.storeResult(right.toString());
				}
			}
		}catch(NullPointerException e){
			System.err.println("Error while printing nodes");
			e.printStackTrace();
		}
		
	}
}
