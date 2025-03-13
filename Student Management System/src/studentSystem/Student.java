package studentSystem;

public class Student {

	private String Name;
	private int RollNo;
	private String Course;
	
	public Student(String name, int rollno, String course) {
		// TODO Auto-generated constructor stub
		Name=name;
		RollNo=rollno;
		Course=course;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	@Override
	public String toString() {
		System.out.println();
		return "Student [Name=" + Name + ", RollNo=" + RollNo + ", Course=" + Course + "]";
	}

}
