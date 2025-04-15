public class MethodOverLoading{
	public static void main(String [] args){
    MethodOverLoadin.greeting();
	MethodOverLoading.greeting("Luigi");
	}
	
	public static void greeting(){
		System.out.println("Good Morning, peeps");
	}	
	
	
	public static void greeting(String name){
		System.out.printf("Good Afternoon, %s%n",name);
	}


    public static void greeting(String name, int age){
		System.out.printf("Good Afternoon, %s your %d years old",age);
		
	}


    public static void greeting(String name, int age, String gender){
		System.out.printf("Good Afternoon, %s , your age %d years old you're a %s%n", name,age);
		
	}



}
