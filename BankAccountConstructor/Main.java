package BankAccountConstructor;
public class Main {
    public static void main(String[] args) {
      BankAccount customerAccount1 = new BankAccount("Hire Bikila","10001213141516",200);
      BankAccount customerAccount2 = new BankAccount("Mulugeta Yawkal","11111111111");
      BankAccount customerAccount3 = new BankAccount("Hiruy Adane","222222222222",98);
      BankAccount customerAccount4 = new BankAccount();
      CustomerSystem.customerService(customerAccount3,customerAccount1);
      //CustomerSystem.customerService(customerAccount1);

    }
}
