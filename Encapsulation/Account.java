package Encapsulation;
public class Account {

	private int acc_no;
	private String name;
	private double balance = 0;

	void set_name(String name) {
		this.name = name;
	}

	void set_acc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	void currentBalance() {
		System.out.println("Current balance : " + balance);

	}

	void deposite(double balance) {
		if (balance < 1) {
			System.out.println("Invalid Ammount!");

		} else {

			this.balance = this.balance + balance;
			System.out.println("Deposite Successfully " + balance+" Curr Bal : "+this.balance);

		}

	}

	void withdraw(double balance) {
		if (balance < 1) {
			System.out.println("Invalid Ammount!");

		} else {
			if (balance > this.balance) {
				System.out.println("Insufficient Balance!"+" Curr Bal : "+this.balance);
			} else {
				this.balance = this.balance - balance;
				System.out.println("Withdrawal Successfully " + balance+" Curr Bal : "+this.balance);

			}
		}

	}

}
