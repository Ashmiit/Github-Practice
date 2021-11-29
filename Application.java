public class Application {

    // Variables
    String name;
    int bal;

    // Constructor
    Application(String name, int bal) {
        this.name = name;
        this.bal = bal;
    }

    public void Withdraw(int num){

        System.out.println("You withdrew $" + num + ". Your new balance is now $" + (bal - num));
        this.bal = this.bal - num;

    }

}
