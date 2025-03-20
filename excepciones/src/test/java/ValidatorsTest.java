import homework.code.ClassWithTwoMethods;
import homework.code.DuplicateEntryException;
import homework.code.ValidateArgs;
import homework.code.ValidateArgsTwo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ValidatorsTest {
    @Test
    @DisplayName("Clase uno prueba con excepcion, division con x y y iguales")
    public void ValidateArgsTest() {
        DuplicateEntryException thrown = assertThrows(
                DuplicateEntryException.class,
                () -> new ValidateArgs(1, 1)
        );
        assertEquals("Cannot have the same value", thrown.getMessage());
    }

    @Test
    @DisplayName("Clase uno prueba con excepcion, division con x y y iguales")
    public void ValidateNullArgsTest() {
        NullPointerException thrown = assertThrows(
                NullPointerException.class,
                () -> new ValidateArgsTwo(1, 1)
        );
        assertTrue(thrown.getMessage().contains("Cannot throw exception"));
    }

    @Test
    @DisplayName("Validator from classWithTwoMethods")
    public void ValidateArgsClassTwoTest() {
        DuplicateEntryException thrown = assertThrows(
                DuplicateEntryException.class, () -> {
                    new ClassWithTwoMethods().argsValidator(2, 2);
                }
        );

        assertTrue(thrown.getMessage().contains("Same"));
    }
}
