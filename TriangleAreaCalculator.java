import java.util.Scanner;

public class TriangleAreaCalculator {

    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Triangle Area Calculator (Base/Height Method)");
        
        // Get base input
		
        System.out.print("Enter base length: ");
        double base = scanner.nextDouble();
		
        
        // Get height input
		
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
		
        
        // Calculate and display area
		
        double area = calculateTriangleArea(base, height);
        System.out.printf("The area of the triangle is: %.2f", area);
        
        scanner.close();
    }
}
