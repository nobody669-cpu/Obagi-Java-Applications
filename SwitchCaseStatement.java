import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter *312# To Load Data");
        System.out.println("Enter *310# To Check Balance");
        System.out.println("Enter *303# To Borrow");

        System.out.print("Enter code: ");
        String option = input.nextLine();

        switch (option) {
            case "*312#":
                System.out.println("");
                System.out.println("Enter 1 for Daily Plans");
                System.out.println("Enter 2 for Weekly Plans");
                System.out.println("Enter 3 for Monthly Plans");
                System.out.println("");

                System.out.print("Enter choice: ");
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Your daily plan has been activated.");
                        break;
                    case 2:
                        System.out.println("Your weekly plan has been activated.");
                        break;
                    case 3:
                        System.out.println("Your monthly plan has been activated.");
                        break;
                    default:
                        System.out.println("Invalid option for subscription plans.");
                }
                break;

            case "*310#":
                System.out.println("Your balance is N3423.323");
                break;

            case "*303#":
                System.out.println("");
                System.out.println("Enter 1 for Borrow 100");
                System.out.println("Enter 2 for Borrow 2500");
                System.out.println("Enter 3 for Borrow 4500");
                System.out.println("Enter 4 for Borrow 7000");

                System.out.print("Enter choice: ");
                int code = input.nextInt();
                input.nextLine();

                switch (code) {
                    case 1:
                        System.out.println("Your account has been credited with 100");
                        break;
                    case 2:
                        System.out.println("Your account has been credited with 2500");
                        break;
                    case 3:
                        System.out.println("Your account has been credited with 4500");
                        break;
                    case 4:
                        System.out.println("Your account has been credited with 7000");
                        break;
                    default:
                        System.out.println("Invalid option for borrowing.");
                }
                break;

            default:
                System.out.println("Invalid Input");
        }

        input.close();
    }
}
