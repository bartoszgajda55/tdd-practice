import main.java.com.bartoszgajda.ValidateISBN;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidateISBNTest {

  @Test
  public void checkValidISBN() {
    ValidateISBN validator = new ValidateISBN();
    boolean result = validator.checkISBN(140449116);
    assertTrue(result);
  }

  @Test
  public void checkInvalidISBN() {
    ValidateISBN validator = new ValidateISBN();
    boolean result = validator.checkISBN(140449117);
    assertFalse(result);
  }
}