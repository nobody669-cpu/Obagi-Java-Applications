public class EhancedForLoop{
	public static void main (String[] args){
		int [] numbers = {9,3,5,4,3};
		
		
		String [] names ={"John", "Mark", "Precious", "John", "Patience");
		System.out.println("The is the traditional for loop");
		for(int i = 0; i < 5; i++){
			System.out.printf("%d%n", numbers[i]);
		}
		
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for(int num : numbers){
			System.out.printf("%d%n", num);
		}
		
		System.out.println("-----------------------------------------------");
		for(String name : names){
			System.out.printf("%s%n", names);
	
	}
	
}
