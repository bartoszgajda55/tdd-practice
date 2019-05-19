package main.java.com.bartoszgajda;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

  @Test
  public void deposit() {
    BankAccount account = new BankAccount("John", "Doe", 1000.00, BankAccount.CHECKING);
    double balance = account.deposit(200.00, true);
    assertEquals(1200.00, balance, 0);
  }

  @Test
  public void withdraw() {
    fail("This test is yet to be implemented");
  }

  @Test
  public void getBalance_deposit() {
    BankAccount account = new BankAccount("John", "Doe", 1000.00, BankAccount.CHECKING);
    account.deposit(200.00, true);
    assertEquals(1200.00, account.getBalance(), 0);
  }

  @Test
  public void getBalance_withdraw() {
    BankAccount account = new BankAccount("John", "Doe", 1000.00, BankAccount.CHECKING);
    account.withdraw(200.00, true);
    assertEquals(800.00, account.getBalance(), 0);
  }

  @Test
  public void isChecking__true() {
    BankAccount account = new BankAccount("John", "Doe", 1000.00, BankAccount.CHECKING);
    assertTrue(account.isChecking());
  }

  @Test
  public void isChecking__false() {
    BankAccount account = new BankAccount("John", "Doe", 1000.00, BankAccount.SAVINGS);
    assertFalse(account.isChecking());
  }
}