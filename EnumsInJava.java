public class EnumsInJava{
	public static void main(String[] args){
		AccountType type = AccountType.SAVINGS;
		
		switch(type){
			case SAVINGS:
			{
				System.out.println("Your Savings Account has been created with an interest of 2.5%");
			}
			break;
			
			case CHECKING:
			{
				System.out.println("Your Checking Account has been created with an interest of 0.0% interest rate");
			}
			break;
			
			case FIXED_DEPOSIT:
			{
				System.out.println("Your Fixed Deposit Account has been created with an interest of 5%");
			}
			break;
			
		}
	}
}