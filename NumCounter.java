import java.util.Scanner;


public class NumCounter{
	public static void main(String[] args){
		 
		 
		 Scanner scanner = new Scanner(System.in);
        int positive = 0, negative = 0, zero = 0;
		
		System.out.println("Enter 10 Numbers:" );
		for (int i = 0; i < 10; i++) {
			int num = scanner.nextInt();
			 if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
		}
    }
	 System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);

        scanner.close();
    }
}
	
		
		


