package studentManagementSystem;

public class MyMainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated constructor stub
		
		Student S1=new Student("Rutuja");
		int Mraks[]= {99,88,74,35,78};
		
		S1.setMarks(Mraks);
		
		S1.DisplayInfo();
		

		
	}

}
