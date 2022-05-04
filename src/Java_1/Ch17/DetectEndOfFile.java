package Ch17;

import java.io.*;

public class DetectEndOfFile {
    public static void main(String[] args) {
        try {
            try (
                    DataOutputStream output = new DataOutputStream(new FileOutputStream("test/test.dat"))
            ) {
                output.writeDouble(4.5);
                output.writeDouble(14.5);
                output.writeDouble(24.5);
            }

            try (
                    DataInputStream input = new DataInputStream(new FileInputStream("test/test.dat"));
            ) {
                while (true)
                    System.out.println(input.readDouble());
            }

        }
        catch (EOFException ex){
            System.out.println("All data were read");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
