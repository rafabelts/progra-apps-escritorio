import homework.code.ClassOne;
import homework.code.ClassWithTwoMethods;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperationsTest {
    ClassOne classOne = new ClassOne();
    ClassWithTwoMethods classWithTwoMethods = new ClassWithTwoMethods();

    @Test
    @DisplayName("Test division by zero")
    void testDivisionByZero() {
        ArithmeticException thrown = assertThrows(
                ArithmeticException.class,
                () -> {
                    classOne.divider(1, 0);
                }
        );
        assertEquals("Cannot divide by zero",  thrown.getMessage());
    }

    @Test
    @DisplayName("Test division")
    void testDivision() {
        assertEquals(2, classOne.divider(4, 2));
    }

    @Test
    @DisplayName("Test testSubtraction")
    void testSubtraction() {
        assertEquals(1, classWithTwoMethods.substraction(2, 1));
    }
}
