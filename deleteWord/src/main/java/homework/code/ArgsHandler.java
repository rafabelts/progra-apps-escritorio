package homework.code;

public class ArgsHandler {
    private final String[] args;

    ArgsHandler(String[] args) {
        this.args = args;
    }

    String getWordToDelete() throws IllegalArgumentException{
        validateArgs();
        return args[0];
    }

    String getFileName() throws IllegalArgumentException {
        validateArgs();
        return args[1];
    }

    void validateArgs() throws IllegalArgumentException{
        if (args.length !=  2) {
            throw new IllegalArgumentException("Wrong number of arguments");
        }
    }
}