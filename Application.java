public class Application {

    // Variables
    String name;
    int bal;

    // Constructor
    Application(String name, int bal) {

        this.name = name;
        this.bal = bal;

    }

    public void Withdraw(int num) {

        System.out.println("You withdrew $" + num + ". Your new balance is now $" + (bal - num));
        this.bal = this.bal - num;

    }

    public void Deposit(int num) {

        System.out.println("You deposited $" + num + ". Your new balance is now $" + (bal + num));
        this.bal = this.bal + num;

    }

    public void CheckBal() {
        System.out.println("Your current balance is $" + this.bal);
    }

}
