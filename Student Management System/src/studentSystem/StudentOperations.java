package studentSystem;

public interface StudentOperations {
	
	void addStudent(String name , int rollNo , String course);
	void displayStudents();
	void updateStudent(int rollNo, String newCourse);

}
