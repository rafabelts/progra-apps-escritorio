package homework.code;

public class DuplicateEntryException extends Exception {
    DuplicateEntryException() {
        super("Same value");
    }

    DuplicateEntryException(String s) {
        super(s);
    }
}
// aqui termina el paso 3