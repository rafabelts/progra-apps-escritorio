package homework.code;
import java.io.*;

public class FileCounter {
    private final File file;
    private long totalChars = 0;
    private long totalWords = 0;
    private long totalLines = 0;

    FileCounter(File file) {
        this.file = file;
    }

    void calculateTotals() throws IOException {
        String charset = "UTF-8";

        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(this.file), charset));
                ) {
            String line;
            while((line = reader.readLine()) != null) {
                this.totalChars += line.length();
                this.totalWords += line.split("\\s").length;
                this.totalLines++;
            }
        }
    }

    void displayResults() throws IOException {
        calculateTotals();
        System.out.println("El archivo tiene:");
        System.out.println((this.totalChars + this.totalLines) + " caracteres");
        System.out.println(this.totalWords+ " palabras");
        System.out.println(this.totalLines + " líneas");
    }
}
