package CodeSoft_3.studentmanagement;

public interface Student_dao {
	
	
	
	public void add(Student s);
	public void remove(int roll_no);
	public void display();
	public void search(int rollno);
	public void saveTOFile(String file);
	public void readFromFile(String file);
	
}
