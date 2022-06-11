package Composite;

public class Client {

  public static void main(String[] args) {
    CompositeAccount component = new CompositeAccount();

    component.addAccount(new Account.DepositeAccount("DA001", 100));
    component.addAccount(new Account.DepositeAccount("DA002", 150));
    component.addAccount(new Account.SavingAccount("SA001", 200));

    float totalBalance = component.getBalance();
    System.out.println("Total Balance : " + totalBalance);
  }

}