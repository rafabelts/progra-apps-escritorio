package homework.code;

import java.io.File;

public class ArgsHandler {
    private final String[] args;
    private File file;

    ArgsHandler(String[] args) {
        this.args = args;
    }

    void validateArgsTotal() throws IllegalArgumentException{
        if(args.length != 1) {
            throw new IllegalArgumentException("Wrong number of arguments");
        }
    }

    void validateFile() throws IllegalArgumentException{
        validateArgsTotal();
        File file = new File(args[0]);

        if(!file.exists()) {
            throw new IllegalArgumentException("File does not exist");
        }

        this.file = file;
    }

    File getFile() throws IllegalArgumentException {
        validateFile();
        return this.file;
    }
}