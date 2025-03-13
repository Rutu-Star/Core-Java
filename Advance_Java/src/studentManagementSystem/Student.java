package studentManagementSystem;

public class Student {
	
	String Name;
	int TotalMarks;
	int Percentage;
	static String School="XYZ School";
	
	int[] Marks=new int[5];

	public Student( String Name) 
	{
		this.Name=Name;
	}
	
	public void setMarks(int[] Marks)
	{
		this.Marks=Marks;
	}
	
	public void ClaculateTotalMarks()
	{
		TotalMarks=0;
		for (int i : Marks) {
			TotalMarks = TotalMarks + i;
		}
	
	}
	
	public void CalculatePercentage()
	{
		//500 for 5 subjects
		Percentage=(100*TotalMarks)/500;
		
	}
	
	public String CalculateGrade()
	{
		String grade;
		
		if(Percentage>=90)
		{
			grade="A+";
		}
		else if(Percentage<90 && Percentage>=80)
		{
			grade="A";
		}
		else if(Percentage<80 && Percentage>=70)
		{
			grade="B+";
		}
		else if(Percentage<70 && Percentage>=60)
		{
			grade="B";
		}
		else if(Percentage<60 && Percentage>=50)
		{
			grade="C+";
		}
		else if(Percentage<50 && Percentage>=40)
		{
			grade="C";
		}
		else if(Percentage<40 && Percentage>=35)
		{
			grade="D";
		}
		else
		{
			grade="Fail";
		}
		return grade;
	}
	
	
	
	
	public void DisplayInfo()
	{
		
		
		ClaculateTotalMarks();
		CalculatePercentage();
		System.out.println("Student Name : "+Name);
		System.out.println("Student School Name : "+School);
		System.out.println("Student Total Marks : "+TotalMarks);
		System.out.println("Student Percentage : "+Percentage);
		System.out.println("Student Grade : "+CalculateGrade());

	}
	

}
