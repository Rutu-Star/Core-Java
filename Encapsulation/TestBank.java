package Encapsulation;

public class TestBank {
	public static void main(String[] args)
	{
		Account a=new Account();
		a.set_name("Rutu");
		a.set_acc_no(201);
		a.currentBalance();
		a.deposite(500);
		a.currentBalance();
		a.deposite(-500);
		a.currentBalance();
		a.withdraw(300);
		a.withdraw(-100);
		a.withdraw(300);
		a.currentBalance();
	}

}
