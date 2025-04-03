import java.util.Scanner;

public class FirstFifteenMultiples {
    public static void main(String[] args) {
        // Initialize the Scanner correctly
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to input a number
        System.out.print("Input a number: ");
        int num = input.nextInt();
        
        // Output the first fifteen multiples of the number
        System.out.printf("First Fifteen Multiples of %d:%n", num);
        
        // Loop to print the multiples
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }

        // Close the Scanner
        input.close();
    }
}

