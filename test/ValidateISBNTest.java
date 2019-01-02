import main.java.com.bartoszgajda.ValidateISBN;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateISBNTest {

  @Test
  public void checkValidISBN() {
    ValidateISBN validator = new ValidateISBN();
    boolean result = validator.checkISBN("0140449116");
    assertTrue(result);
  }

  @Test
  public void checkInvalidISBN() {
    ValidateISBN validator = new ValidateISBN();
    boolean result = validator.checkISBN("0140449117");
    assertFalse(result);
  }

  @Test
  public void checkIfIsTenDigits() {
    ValidateISBN validator = new ValidateISBN();
    boolean result = validator.checkISBN("123456789");
    assertThrows(NumberFormatException.class, fail());
  }
}