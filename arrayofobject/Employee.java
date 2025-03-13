package arrayofobject;

public class Employee {
	private String name;
	private int id;
	
	//zero parameterize constructor
	 public Employee() {
			super();
		}
	 
	 
	//parameterize constructor
	 Employee(String name,int id)
	 {
		 this.name=name;
		 this.id=id;
	 }
	 
	

	//set method 
	 public void setter(String name ,int id)
	 {
		 this.name=name;
		 this.id=id;
	 }
	 
	 //set method
	 public void getter()
	 {
		 System.out.println("Employee Name : "+name +" Employee ID : "+id);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	 
	 
	 

}
