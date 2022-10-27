package overriding;

interface IManageAccount{
	void openAccount();
	void closeAccount();
}
interface IBankAccount extends IManageAccount{
	
	int rate_of_interest = 0;
	public static void welcomeMessage() {
		System.out.println("Welcome to ABC Bank");
	}
	
	public default void welcome() {
		System.out.println("Welcome");
	}
	void deposit();
	void withdraw();
	void balance();
}

class SavingAccountHere implements IBankAccount,IManageAccount{
	@Override
	public void deposit() {
		System.out.println("Deposited");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw");
		
	}

	@Override
	public void balance() {
		System.out.println("Balance");
		
	}

	@Override
	public void openAccount() {
		System.out.println("Account is opened");
		
	}

	@Override
	public void closeAccount() {
		System.out.println("Account is closed");
		
	}

}

public class InterfaceOverridingExample {

	public static void main(String[] args) {
		IBankAccount.welcomeMessage();
		SavingAccountHere sa = new SavingAccountHere();
		sa.balance();
		sa.deposit();
		sa.withdraw();
		sa.openAccount();
		sa.closeAccount();
		sa.welcome();

	}

}

