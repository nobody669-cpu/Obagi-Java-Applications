import java.util.Random;



public class AccountNumberGenerator{
	public static void main(String [] args){
		Random rand = new Random();
		
		
		long accountNumber = rand.nextLong();	
	        System.out.printf("The account number is %d%n", accountNumber);
			
	}
	
}


		