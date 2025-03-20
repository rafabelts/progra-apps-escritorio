package homework.code;

public class ValidateArgsTwo {
        public ValidateArgsTwo(int x, int y) throws DuplicateEntryException {
            if (x == y) {
                DuplicateEntryException exception = null;

                throw exception;
            }
        }
}
