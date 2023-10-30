import java.util.Scanner;

public class BankAccount {
    static String accountName;
    static int accountNumber;
    static double balance;
    static  String account = null;

    public BankAccount() {
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    Enter your option:
                    1. Create Account
                    2. Deposit
                    3. Withdraw
                    4. Balance
                    5. Exit
                    """);
            int choice = sc.nextInt();
            selectChoice(choice);
        }
    }
    public static void selectChoice(int choice) {
        switch (choice) {
            case 1 -> createAccount();
            case 2 -> deposit();
            case 3 -> withdraw();
            case 4 -> balance();
            case 5 -> exit();
            default -> System.out.println("Invalid option. Please select from 1 - 5 only.");

        } ;
    }
    public static void createAccount(){
        if (account != null) System.out.println("Account already exists. please sign in.");
        else {
            System.out.println("Enter Account Number: ");
            accountNumber = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Account Name: ");
            accountName = sc.nextLine();
            System.out.println("Enter Initial Deposit: ");
            double initialDeposite = sc.nextInt();
            balance += initialDeposite;
            System.out.println("Congratulations...\nAccount CREATED.");
            account = "created";
        }

    }
    public static void deposit(){
        if (account == null) System.out.println("Please create your account first.");
        else {
            System.out.println("Enter Amount to deposit: ");
            double deposit = sc.nextDouble();
            balance += deposit;
            System.out.println("Rs. " + deposit + " is credited.");
            System.out.println("Your current balance is : " + balance);
        }
    }
    public static void withdraw(){
        if (account == null) System.out.println("Please create your account first.");
        else {
            System.out.println("Enter Amount to withdraw: ");
            double withdraw = sc.nextDouble();
            if (balance < withdraw)
                System.err.println("There is no sufficient balance. Your current balance is: " + balance);
            else {
                balance -= withdraw;
                System.out.println("Rs. " + withdraw + " is debited.");
                System.out.println("Your current balance is : " + balance);
            }
        }
    }
    public static void balance(){
        if (account != null) {
            System.out.println("Account Number is : " + accountNumber);
            System.out.println("Account Name is : " + accountName);
            System.out.println("Account Balance is : " + balance);
        }
        else System.out.println("Create account please.");
    }
    public static void exit(){
        System.out.println("---BYE BYE---");
        System.exit(0);
    }
}
