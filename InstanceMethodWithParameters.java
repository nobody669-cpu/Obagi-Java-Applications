public class InstanceMethodWithParameters{
	public static void main (String[] args){
	InstanceMethodWithParameters imvp = new InstanceMethodWithParameters();
	int result = imvp.addition(50,17);
	System.out.printf("The sum is %d%n",result);
	}
	
	
	public int addition(int num1, int num2){
		int sum = num1 + num2;
		
		return sum;
	}
	
}