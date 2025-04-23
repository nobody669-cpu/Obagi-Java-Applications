import java.util.Random;

public class RandomNumberGenerator{
	public static void main(String [] args){
		Random rand = new Random();
		
		Boolean option = rand.nextBoolean();
		System.out.printf("Do youlove Java?, %b%n", option);
		
		int integer = rand.nextInt();
		System.out.printf("The integer is %d%n", integer);
		
		int integerWithBound = rand.nextInt(101); //or (100) + 1
		System.out.printf("The integer is %d%n", integerWithBound);
		
		long number = rand.nextLong();
		System.out.printf("The integer is %d%n", number);
		
		long numberWithBound = rand.nextLong(8_000_000_000L);
		System.out.printf("The integer is %d%n", numberWithBound);
		
		float floatNumber = rand.nextFloat();
        System.out.printf("The float number is %f%n", floatNumber); 

        double doubleNumber = rand.nextDouble();
        System.out.printf("The double number is %f%n", doubleNumber); 
		
		
	
	}
}