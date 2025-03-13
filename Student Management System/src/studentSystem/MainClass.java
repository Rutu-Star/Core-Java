package studentSystem;

public class MainClass {

	public static void main(String[] args)
	{
		StudentManager s=new StudentManager();
		
		//add srudent to system
		//System.out.println("The sudent added to system : ");
		s.addStudent("Akash", 1, "Java");
		s.addStudent("Rutu", 2, "Testing");
		s.addStudent("Sandhya", 3, "AWS");
		s.addStudent("Rahul", 4, "DotNet");
		s.addStudent("Tina", 5, "Java");
		s.addStudent("Anjali", 6, "Testing");
		s.addStudent("Sonal", 7, "Java");
		s.addStudent("Rakesh", 8, "Java");
		s.addStudent("Anna", 9, "AWS");
		s.addStudent("Minal", 10, "Java");
		
		//display all students details
		System.out.println("Display the student details : ");
		s.displayStudents();
		
		//update a student course
		//System.out.println("Update the student course : ");
		s.updateStudent(9, "Testing");
		
		//display updated student list
		System.out.println("The updated student list : ");
		s.displayStudents();
	}

}
