package main.java.com.bartoszgajda;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {
  private BankAccount account;

  @Before
  public void setup() {
    account = new BankAccount("John", "Doe", 1000.00, BankAccount.CHECKING);
  }

  @Test
  public void deposit() {
    double balance = account.deposit(200.00, true);
    assertEquals(1200.00, balance, 0);
  }

  @Test
  public void withdraw() {
    fail("This test is yet to be implemented");
  }

  @Test
  public void getBalance_deposit() {
    account.deposit(200.00, true);
    assertEquals(1200.00, account.getBalance(), 0);
  }

  @Test
  public void getBalance_withdraw() {
    account.withdraw(200.00, true);
    assertEquals(800.00, account.getBalance(), 0);
  }

  @Test
  public void isChecking__true() {
    assertTrue(account.isChecking());
  }
}