import java.util.Scanner;

public class NestedIfElseStatement{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = input.nextLine();
		
		System.out.print("Enter Mark: ");
		int mark = input.nextInt();
		
		
		if (mark > 100){
			System.out.println("Mark shouldn't exceed 100");
		}
		
		else{
		
		if(mark >= 80){
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your mark is %d%n",mark);
			System.out.printf("Your grade is %c%n",'A');			
		}
		
		else if(mark >= 70){
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your mark is %d%n",mark);
			System.out.printf("Your grade is %c", 'B');	
		}
		
		else if(mark >= 60){
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your mark is %d%n",mark);
			System.out.printf("Your grade is %c%n",'C');
		}
		
		else if(mark >= 50){
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your mark is %d%n",mark);
			System.out.printf("Your grade is %c%n",'D');
		}	
		
		else if(mark >= 40){
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your mark is %d%n",mark);
			System.out.printf("Your grade is %c%n",'E');
		}
		
		else{ 
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your mark is %d%n",mark);
			System.out.printf("Your grade is %c%n",'F');

        }
		}                                                      
	}
}

