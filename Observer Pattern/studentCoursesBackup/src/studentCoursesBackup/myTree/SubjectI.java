package studentCoursesBackup.src.studentCoursesBackup.myTree;

public interface SubjectI {

	public void register(ObserverI obj);
	
	public void remove(ObserverI obj);
	
	public void notify(String updateType, String update);
}
