import com.bartoszgajda.ValidateISBN;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidateISBNTest {

  @Test
  public void checkValidISBN() {
    ValidateISBN validator = new ValidateISBN();
    boolean result = validator.checkISBN(140449116L);
    assertTrue(result);
  }
}