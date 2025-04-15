import java.util.Scanner;


public class Numbers {
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number you want to loop through: ");
		int limit = input.nextInt();
	
	
		for (int i = 1; i <= limit; i++) {
			
			if(i % 2 == 0){
				System.out.printf("This Number is Even: %d%n", i);
			}
			
			else{
				System.out.printf("This Number is Odd: %d%n", i);
			}
		
		boolean isPrime = true;
		
		if (i <= 1) {
			isPrime = false;
		}
		else {
						
		    for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
				    break;
			}
		}
	}
	
	if (isPrime) {
		System.out.println("It is also a Prime Number");
	}
	else {
		System.out.println("It isn't a Prime Number");
	}
	
			
		}
	}
}