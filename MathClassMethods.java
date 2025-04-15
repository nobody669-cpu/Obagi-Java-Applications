import java.util.Scanner;

public class MathClassMethods{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Enter a number: ");
		double num = scan.nextDouble();
		
		System.out.printf("The absolute value %f%n",Math.abs(num));
		System.out.printf("The rounded value is %d%n",Math.abs(Math.round(num)));
		System.out.printf("%.1f raised to the power of 2 is %.1f%n", num, Math.pow(num, 2));
		System.out.printf("The Square root of %.1f is %.1f%n", num, Math.sqrt(num));
		System.out.println("_________________________________________________________________");
		
		System.out.print("Enter first number: ");
		double num1 = scan.nextDouble();
		
		System.out.print("Enter second number: ");
		double num2 = scan.nextDouble();
		
		System.out.printf("The minimum number is %.1f%n",Math.min(num1,num2));
		System.out.printf("The maximum number is %.1f%n",Math.max(num1,num2));
		
		System.out.println("_________________________________________________________________");
		
		System.out.printf("The maximum number is %.1f%n",Math.max(num1,num2));
		
		double radius;
		double areaOfCircle;
		
		System.out.print("Enter your desired radius: ");
		radius = scan.nextDouble();
		
		areaOfCircle = 2 * Math.PI * Math.pow(radius,2);
		
		System.out.printf("The area of the circle is %.2f%n", areaOfCircle);
		
		
	
	
	
	}
	
}