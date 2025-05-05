import java.util.Scanner;

public class ThreeNumberComparison {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three numbers to find the largest:");
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        
        // Comparing all three numbers
        if (num1 == num2 && num2 == num3) {
            System.out.println("All three numbers are equal.");
        }
        else if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is num1: " + num1);
        }
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The largest number is num2: " + num2);
        }
        else {
            System.out.println("The largest number is num3: " + num3);
        }
        
       
    }
}