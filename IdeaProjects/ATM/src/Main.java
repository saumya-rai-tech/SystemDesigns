import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankService bankingService = new BankService();
        CashDispenser cashDispenser = new CashDispenser(10000);
        ATM atm = new ATM(bankingService, cashDispenser);

        // Create sample accounts
        bankingService.createAccount("1234567890", "Aman", 1000.0);
        bankingService.createAccount("9876543210", "Ram", 500.0);

        // Perform ATM operations
        Card card = new Card("1234567890", "1234", "Aaman");

        System.out.println("Enter your account number");
        String accountNumber = sc.next();
        System.out.println("Please enter your PIN: ");
        String pin = sc.next();
        boolean pinMatch = atm.authenticate(card, "1234");
        if (pinMatch) {
            double balance;
            System.out.println("Enter your choice");
            System.out.println("1. Balance" + "\n" + "2. WithDraw Amount" + "\n" + "3. Deposit Money" + "\n" + "4. Quit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    balance = atm.checkBalance(accountNumber);
                    System.out.println("Account balance: " + balance);
                    break;
                case 2:
                    atm.withDrawCash(accountNumber, 500.0);
                    break;
                case 3:
                    atm.depositCash(accountNumber, 200.0);
                    break;
            }
        } else {

            System.out.println("Pin Mismatch");
        }


//            balance = atm.checkBalance("9876543210");
//            System.out.println("Updated account balance: " + balance);
    }
}