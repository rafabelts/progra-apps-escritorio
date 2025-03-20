package homework.code;

import java.util.Arrays;

public class ClassWithTwoMethods {
    // metodo a
    public void argsValidator (int x, int y) throws DuplicateEntryException {
        if (x == y) {
            throw new DuplicateEntryException();
        }
    }

    public int substraction(int x, int y) {
        return x - y;
    }

    // metodo b
    void substractionResult(int x, int y)  {
        try {
            argsValidator(x, y);
            System.out.printf("%d -  %d = %d\n", x, y, substraction(x, y));
        } catch (Exception e) {
            System.err.println(Arrays.toString(e.getStackTrace()));
            System.err.println(e.getMessage());
        }

    }

}
