package entities;

public class Account {
	private int Number;
	private double Balance;
	private String Holder;
	
	public Account(){
		
	}
	
	public Account(int number, String holder) {
		super();
		Number = number;
		Holder = holder;
	}


	public void deposit(double amount) {
		Balance += amount;
	}
	public void withdraw(double amount) {
		Balance -= amount - 5; 
	}
	
	

	public int getNumber() {
		return Number;
	}

	public double getBalance() {
		return Balance;
	}

	public String getHolder() {
		return Holder;
	}

	public void setHolder(String holder) {
		Holder = holder;
	}
	public String ToString() {
		return String.format("%d",getNumber());
	}
	}
	