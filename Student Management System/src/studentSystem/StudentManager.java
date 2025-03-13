package studentSystem;

import java.util.ArrayList;

public class StudentManager implements StudentOperations{
	

	public StudentManager() {
		// TODO Auto-generated constructor stub
	}

	
	ArrayList<Student> student=new ArrayList<Student>();
	
	
	

	
	
	
	
	@Override
	public void addStudent(String name, int rollNo, String course) {
		// TODO Auto-generated method stub
		
		student.add(new Student(name,rollNo,course));
	}

	@Override
	public void displayStudents() {
		// TODO Auto-generated method stub
		System.out.println("The Student Data is follow : ");
		for(Student s: student )
		{
			System.out.println(s);
		}
	}

	@Override
	public void updateStudent(int rollNo, String newCourse) {
		// TODO Auto-generated method stub
		
		for(Student s: student)
		{
			if(s.getRollNo()==rollNo)
			{
				s.setCourse(newCourse);
			}
		}
	}

}
