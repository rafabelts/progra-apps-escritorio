package homework.code;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            ArgsHandler validateArgs = new ArgsHandler(args);
            FileHandler fileHandler = new FileHandler(validateArgs.getWordToDelete(), validateArgs.getFileName());

            fileHandler.processFile();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}