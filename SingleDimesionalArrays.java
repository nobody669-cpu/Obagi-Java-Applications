public class SingleDimesionalArrays{
	public static void main(String[] args){
		int[] numbers = {17,15,18,19,14};
		
		String[] names = {"Jace", "Mike", "Jeroboam", "Kyle", "Houston"};
		
		for (int i = 0; i<5; i++){
			System.out.printf("%s is %d years old %n",names[i],numbers[i]);
		}
	}
}