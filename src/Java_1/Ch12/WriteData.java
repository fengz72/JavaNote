package Ch12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("us.txt");
        if (file.exists()) {
            file.delete();
        }

//        PrintWriter output = new PrintWriter(file);
//
//        output.print("HeJun ");
//        output.print(90);
//        output.print("Java");
//        output.println(100);
//
//        output.close();

        try (PrintWriter output = new PrintWriter(file)) {
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(100);
        }

    }
}
