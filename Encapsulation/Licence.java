package Encapsulation;

public class Licence {

	public static void main(String[] args) {
		Person p = new Person();
		p.set("Rutu", 102);
		p.checkEligibilty();
		p.set("Sandhya", 18);
		p.checkEligibilty();
		p.set("Sam", 32);
		p.checkEligibilty();
		p.set("Sayali", 62);
		p.checkEligibilty();
		p.set("Soham", 70);
		p.checkEligibilty();
		p.set(null, -1);
		p.checkEligibilty();

	}

}
