package overriding;

abstract class Account{
	protected int accountNumber;
	protected String accountName;
	public Account(int accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}
	abstract void display();
}

class Saving extends Account{
    int balance;
	public Saving(int accountNumber, String accountName,int balance) {
		super(accountNumber, accountName);
		this.balance=balance;
	}
	@Override
	void display() {
		System.out.println("Account Number : " +this.accountNumber);
		System.out.println("Account Name : " +this.accountName);
		System.out.println("Account Balance : "+this.balance);
		
	}
	
}

abstract class Deposit extends Account{
    int amount;
    String maturityDate,openingDate;
	public Deposit(int accountNumber, String accountName,int amount,String maturityDate,String openingDate) {
		super(accountNumber, accountName);
		this.amount=amount;
		this.maturityDate=maturityDate;
		this.openingDate=openingDate;
	}
	@Override
	void display() {
		System.out.println("Account Number : " +this.accountNumber);
		System.out.println("Account Name : " +this.accountName);
		System.out.println("Amount : "+this.amount);
		System.out.println("Maturity Date :"+this.maturityDate);
		System.out.println("Opening Date : " +this.openingDate);
	}
	
}

class ShortTerm extends Deposit{
    int months;
	public ShortTerm(int accountNumber, String accountName, int amount, String maturityDate, String openingDate,int months) {
		super(accountNumber, accountName, amount, maturityDate, openingDate);
		this.months=months;
	}
	@Override
	void display() {
		System.out.println("Account Number : " +this.accountNumber);
		System.out.println("Account Name : " +this.accountName);
		System.out.println("Amount : "+this.amount);
		System.out.println("Maturity Date :"+this.maturityDate);
		System.out.println("Opening Date : " +this.openingDate);
		System.out.println("Number of Years :"+this.months);
	}
}

class LongTerm extends Deposit{
	int years;

	public LongTerm(int accountNumber, String accountName, int amount, String maturityDate, String openingDate,int years) {
		super(accountNumber, accountName, amount, maturityDate, openingDate);
		this.years=years;
	}
	@Override
	void display() {
		super.display();
		System.out.println("Number of Years :"+this.years);
	}
	
}
public class AbstractExample {

	public static void main(String[] args) {
		Saving sa = new Saving(1234, "Nandini", 2000);
		sa.display();
		
		System.out.println("--------------------------");
		
		ShortTerm st = new ShortTerm(1234, "Nandini", 50000, "12-5-2023", "12-5-2021", 2);
		st.display();
		
		System.out.println("--------------------------");
		
		LongTerm lt = new LongTerm(123456, "Nandini", 200000, "23-5-2023", "23-5-2021", 2);
		lt.display();
		

	}

}
