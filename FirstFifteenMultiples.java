import java.util.Scanner;

public class FirstFifteenMultiples {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
		System.out.print("Input a number: ");
        int num = input.nextInt();
        
        System.out.printf("First Fifteen Multiples of %d:%n", num);
        
		for (int i = 1; i <= 15; i++) {
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }
    }
}

