package BankAccountConstructor;
public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double accountBalance;
    public BankAccount(){
       this("No Name","000000000");
    }
    public BankAccount(String accountName,String accountNumber){
        this(accountName,accountNumber,0);
    }
    public BankAccount(String accountName,String accountNumber,double accountBalance){
        this.accountBalance = accountBalance;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public String getAccountName(){
        return accountName;
    }
    public void deposit(double amount){
        accountBalance+=amount;
        System.out.println("You have successfully deposited: "+amount+" birr and your current balance is: "+accountBalance+" birr");
    }
    public void withdraw(double amount){
        if ((accountBalance-amount)>=0){
            accountBalance-=amount;
            System.out.println("Dear, "+accountName);
            System.out.println("You did successfully withdraw: "+amount+" birr and your current balance is: "+accountBalance+" birr");
        }
        else{
            System.out.println("Dear, "+accountName+" You can't withdraw more than you have!!");
            System.out.println("Your current balance is: "+accountBalance);
        }
    }
   /* public void transfer(BankAccount user2, double amount){
        double balance2 = user2.getAccountBalance();
        if ((accountBalance-amount)>=0){
            accountBalance -=amount;
            user2.setAccountBalance(balance2+amount);
            System.out.println("Dear, "+accountName+" you have successfully transferred "+amount+" birr to "+user2.getAccountName());
            System.out.println("Dear, "+accountName+" your balance is: "+accountBalance);
            System.out.println("Dear, "+ user2.getAccountName() + " Your balance is: "+user2.getAccountBalance());
        }
        else{
            System.out.println("Dear, "+accountName+" You can't transfer more than you have!!");
            System.out.println("Your current balance is: "+accountBalance);        }
    }*/
    public static void transfer(BankAccount user1, BankAccount user2, double amount){
        if (user1.getAccountBalance() - amount>=0){
            System.out.println("Dear, "+user1.getAccountName()+" you have successfully transferred "+amount+" birr to "+user2.getAccountName());
            user1.setAccountBalance(user1.getAccountBalance()-amount);
            user2.setAccountBalance(user2.getAccountBalance()+amount);
            System.out.println("Dear, "+user1.getAccountName()+" your balance is: "+user1.getAccountBalance());
            System.out.println("Dear, "+ user2.getAccountName() + " Your balance is: "+user2.getAccountBalance());
        }
        else {
            System.out.println("Dear, "+user1.getAccountName()+" You can't transfer more than you have!!");
            System.out.println("Your current balance is: "+user1.getAccountBalance());
        }
    }
}
