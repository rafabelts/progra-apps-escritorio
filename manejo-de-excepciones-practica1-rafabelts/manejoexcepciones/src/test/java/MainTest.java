import homework.code.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Test para probar el ingreso de un número impar")
    void testOddNumber() {
        Exception exception = assertThrowsExactly(
                Exception.class, () -> {
                    Main.isEven(1);
                }
        );

        assertEquals("El numero es impar", exception.getMessage());
    }

    @Test
    @DisplayName("Test para probar el ingreso de un número par")
    void testEvenNumber() {
        assertDoesNotThrow(() -> {
            Main.isEven(2);
        });
    }
}