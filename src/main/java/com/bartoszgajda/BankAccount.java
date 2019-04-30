package main.java.com.bartoszgajda;

public class BankAccount {
  private String firsName;
  private String lastName;
  private double balance;

  public BankAccount(String firsName, String lastName, double balance) {
    this.firsName = firsName;
    this.lastName = lastName;
    this.balance = balance;
  }

  /**
   * The branch argument is true if customer is performing the transaction
   * at a branch, with a teller. It's false if the customer is performing
   * the transaction at an ATM
   *
   * @param amount Money amount to be stored
   * @param branch Is the transaction performed at a branch or using an ATM
   * @return balance The balance after transaction
   */
  public double deposit(double amount, boolean branch) {
    balance += amount;
    return balance;
  }

  /**
   * The branch argument is true if customer is performing the transaction
   * at a branch, with a teller. It's false if the customer is performing
   * the transaction at an ATM
   *
   * @param amount The amount of money to be withdrawn
   * @param branch Is the transaction performed at a branch or using an ATM
   * @return The balance after the withdrawal
   */
  public double withdraw(double amount, boolean branch) {
    balance -= amount;
    return balance;
  }

  public double getBalance() {
    return balance;
  }
}
