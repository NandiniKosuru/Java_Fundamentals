package operators;

public class Assessment {
	public static void main(String[] args) {
		boolean isLoggedIn=true;
		boolean isEmailVerified=true;
		boolean isCardInfoValid=false;
		if(isLoggedIn && isEmailVerified && isCardInfoValid) {
			System.out.println("Logged in successfully and You can purchase now");
		}
		else {
			System.out.println("Can't Purchase becaz Invalid Details");
		}
	}

}
