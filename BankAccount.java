import java.util.Scanner;

class BankAccount {

    String accountHolder;
    double balance;


    BankAccount(String accountHolder, double balance) {

        this.accountHolder = accountHolder;
        this.balance = balance;

    }


    void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Amount Deposited: " + amount);

    }


    void withdraw(double amount) {

        if(amount <= balance) {

            balance = balance - amount;

            System.out.println("Amount Withdrawn: " + amount);

        }
        else {

            System.out.println("Insufficient Balance");

        }

    }


    void display() {

        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);

    }

}



public class BankAccount {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();


        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();


        BankAccount account = new BankAccount(name, balance);



        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();

        account.deposit(deposit);



        System.out.print("Enter Withdraw Amount: ");
        double withdraw = sc.nextDouble();

        account.withdraw(withdraw);



        account.display();


        sc.close();

    }
}