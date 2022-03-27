package Resource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class FileResource {

    //
    public String words(String filename) {
        File file = new File(Objects.requireNonNull(getClass().getResource(filename)).getPath());
        try {
            Scanner scanner = new Scanner(file);
            String lines = "";
            while (scanner.hasNextLine()) {
                lines += scanner.nextLine() + " ";
            }
            return lines;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }
}
