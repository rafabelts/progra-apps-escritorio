package homework.code;

import java.io.*;

public class FileHandler {
    private final String wordToDelete;
    private final File file;

    FileHandler(String wordToDelete, String fileName){
        this.wordToDelete = wordToDelete;
        this.file = new File(fileName);
    }

    void validateFile() throws IOException {
        if(!file.exists()) {
           throw new IOException("File does not exist");
        }
    }

    void deleteWord() throws IOException {
        validateFile();
        File tempFile = File.createTempFile("output", ".txt", this.file.getParentFile());
        String charset = "UTF-8";

        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(this.file), charset));
                PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(tempFile), charset));
        ) {
            manipulateFile(reader, writer);
        }

        if(!this.file.delete()) {
            throw new IOException("Unable to delete file");
        }

        if(!tempFile.renameTo(this.file)) {
            throw new IOException("Unable to rename file");
        }

        System.out.println("File updated successful");
    }

    void manipulateFile(BufferedReader reader,  PrintWriter writer) throws IOException {
        String line;
        boolean firstLine = true;

        while ((line = reader.readLine()) != null) {
            // replace empty lines and delete whitespaces
            line = line.replaceAll(this.wordToDelete, "").replaceAll("\\s+", " ").trim();
            if (!line.isEmpty()) {
                // if is not the first line inserts an empty space before writing the line
                if(!firstLine) {
                    writer.println();
                }

                writer.print(line);
                firstLine = false;
            }
        }
    }

}
