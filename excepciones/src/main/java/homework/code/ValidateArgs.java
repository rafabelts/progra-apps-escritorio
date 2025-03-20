package homework.code;

public class ValidateArgs {
    public ValidateArgs(int x, int y) throws DuplicateEntryException {
        if (x == y) {
            DuplicateEntryException exception = new DuplicateEntryException("Cannot have the same value");

            throw exception;
        }
    }
}
// aqui termina el paso 4