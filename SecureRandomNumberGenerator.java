import java.security.SecureRandom;

public class SecureRandomNumberGenerator{
	public static void main(String [] args){
		SecureRandom secureRand = new SecureRandom();
		
		Boolean option = secureRand.nextBoolean();
		System.out.printf("Do youlove Java?, %b%n", option);
		
		int integer = secureRand.nextInt();
		System.out.printf("The integer is %d%n", integer);
		
		int integerWithBound = secureRand.nextInt(101); //or (100) + 1
		System.out.printf("The integer is %d%n", integerWithBound);
		
		long number = secureRand.nextLong();
		System.out.printf("The integer is %d%n", number);
		
		long numberWithBound = secureRand.nextLong(8_000_000_000L);
		System.out.printf("The integer is %d%n", numberWithBound);
		
		float floatNumber = secureRand.nextFloat();
        System.out.printf("The float number is %f%n", floatNumber); 

        double doubleNumber = secureRand.nextDouble();
        System.out.printf("The double number is %f%n", doubleNumber); 
		
		
	
	}
}