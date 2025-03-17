package homework.code;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            ArgsHandler argsHandler = new ArgsHandler(args);
            File file = argsHandler.getFile();

            FileCounter counter = new FileCounter(file);
            counter.displayResults();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}