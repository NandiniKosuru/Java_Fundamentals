package overriding;

abstract class ManageAccount{
	public static void welcomeMessage() {
		System.out.println("Welcome");
	}
	public abstract void openAcount();
	public abstract void closeAccount();
}

abstract class BankAccount extends ManageAccount{
	public abstract void deposit();
	public abstract void withdraw();
	public abstract void balance();
}

class SavingAccount extends BankAccount{

	@Override
	public void deposit() {
		System.out.println("Deposit in saving account");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw in saving account");
		
	}

	@Override
	public void balance() {
		System.out.println("Balance in saving account");
		
	}

	@Override
	public void openAcount() {
		System.out.println("Your Account is opened");
		
	}

	@Override
	public void closeAccount() {
		System.out.println("Your account is closed");
		
	}
	
}
 class CurrentAccount extends BankAccount{

	@Override
	public void deposit() {
		System.out.println("Deposit in current account ");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw in current account ");
		
	}

	@Override
	public void balance() {
		System.out.println("Balance in current account ");
		
	}

	@Override
	public void openAcount() {
			System.out.println("Your Account is opened");
	}

	@Override
	public void closeAccount() {
			System.out.println("Your Account is closed");
		
	}
	 
 }
public class OverridingExample {

	public static void main(String[] args) {
		ManageAccount.welcomeMessage();
		CurrentAccount c = new CurrentAccount();
		c.deposit();
		c.withdraw();
		c.balance();
		c.openAcount();
		c.closeAccount();
		
		System.out.println("--------------------------");
		
		SavingAccount s = new SavingAccount();
		s.deposit();
		s.withdraw();
		s.balance();
		s.openAcount();
		s.closeAccount();

	}

}
