import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        // Varibales
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean exit = false;

        // Creating Object
        Application ZainZilla = new Application("Zain Zilla", 6);

        while (!exit) {
            System.out.println("Enter 1 to make a deposit");
            System.out.println("Enter 2 to make a withdrawal");
            System.out.println("Enter 3 to check balance");
            System.out.println("Enter 4 to make a exit application");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("How much would you like to deposit");
                    ZainZilla.Deposit(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw");
                    ZainZilla.Withdraw(scanner.nextInt());
                    break;
                case 3:
                    ZainZilla.CheckBal();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting application...");
                default:
                    System.out.println("Invalid Input, Please use only whole numbers");
                    break;
            }

        }

    }
}