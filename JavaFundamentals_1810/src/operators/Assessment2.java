package operators;

public class Assessment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				boolean isLoggedInEmail=true;
				boolean isLoggedInGoogle=true;
				boolean isLoggedInFacebook=false;
				if(isLoggedInEmail || isLoggedInGoogle || isLoggedInFacebook) {
					System.out.println("You can access the course now");
				}
				else {
					System.out.println("Can't acces the course");
				}


	}

}
