package homework.code;

import java.util.Arrays;

public class ClassOne {
    public int divider(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return x / y;
    }


    public void makeDivisionWithValidation(int x, int y){
        try {
            new ValidateArgs(x, y);
            System.out.printf("%d / %d = %d\n", x, y, this.divider(x, y));
        } catch (Exception e) {
            System.err.println(e.getMessage());
            // aqui termina paso 1
            System.err.println(Arrays.toString(e.getStackTrace()));
        } finally {
            System.out.println("Llegaste al finally!!");
        }
        // aqui termina el paso 2
    }

    public void makeDivisionWithValidationTwo(int x, int y) {
        try {
            new ValidateArgsTwo(x, y);
            System.out.printf("%d / %d = %d\n", x, y, this.divider(x, y));
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println(Arrays.toString(e.getStackTrace()));
        } finally {
            System.out.println("Llegaste al finally!!");
        }
        // aqui termina el paso 5
    }

}
