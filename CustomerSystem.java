package BankAccountConstructor;
import java.util.Scanner;
public class CustomerSystem {
    public static void customerService(BankAccount user1){
        Scanner scanner = new Scanner(System.in);
        boolean toContinue = true;
        do {
            System.out.println("[1] to see your name");
            System.out.println("[2] to see your account number");
            System.out.println("[3] to see your balance");
            System.out.println("[4] to deposit money");
            System.out.println("[5] to withdraw money");
            System.out.println("[6] to quit");
            char userChoice = scanner.next().charAt(0);
            switch (userChoice){
                case'1' -> {
                    System.out.println(user1.getAccountName());
                }
                case'2' -> {
                    System.out.println(user1.getAccountNumber());
                }
                case'3' -> {
                    System.out.println(user1.getAccountBalance());
                }
                case'4' -> {
                    System.out.print("enter the amount you want to deposit: ");
                    double amount = scanner.nextDouble();
                    user1.deposit(amount);
                }
                case'5' -> {
                    System.out.print("enter the amount you want to withdraw: ");
                    double amount = scanner.nextDouble();
                    user1.withdraw(amount);
                }
                case '6' ->{
                    System.out.println("Thanks for your service");
                    toContinue = false;
                }
                default -> System.out.println("Only from 1 to 6");
            }
        }while(toContinue);
    }
    public static void customerService(BankAccount user1,BankAccount user2){
        Scanner scanner = new Scanner(System.in);
        boolean toContinue = true;
        do {
            System.out.println("[1] to see your name");
            System.out.println("[2] to see your account number");
            System.out.println("[3] to see your balance");
            System.out.println("[4] to deposit money");
            System.out.println("[5] to withdraw money");
            System.out.println("[6] to transfer money");
            System.out.println("[7] to quit");
            char userChoice = scanner.next().charAt(0);
            switch (userChoice){
                case'1' -> {
                    System.out.println(user1.getAccountName());
                }
                case'2' -> {
                    System.out.println(user1.getAccountNumber());
                }
                case'3' -> {
                    System.out.println(user1.getAccountBalance());
                }
                case'4' -> {
                    System.out.print("enter the amount you want to deposit: ");
                    double amount = scanner.nextDouble();
                    user1.deposit(amount);
                }
                case'5' -> {
                    System.out.print("enter the amount you want to withdraw: ");
                    double amount = scanner.nextDouble();
                    user1.withdraw(amount);
                }
                case'6' ->{
                    System.out.print("enter the money you want to send: ");
                    double amount = scanner.nextDouble();
                    BankAccount.transfer(user1, user2,amount);
                }
                case '7' ->{
                    System.out.println("Thanks for your service");
                    toContinue = false;
                }
                default -> System.out.println("Only from 1 to 6");
            }
        }while(toContinue);
    }
}
