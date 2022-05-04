package Ch17;

import java.io.*;

public class TestDataStream {
    public static void main(String[] args) throws IOException {
        try (
                DataOutputStream output = new DataOutputStream(new FileOutputStream("test/temp.txt"))
        ) {
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("85.5");
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.5);
        }

        try (
                DataInputStream input = new DataInputStream(new FileInputStream("test/temp.txt"))
                ){
            System.out.println(input.readUTF() + " " + input.readDouble() + " " + input.readUTF());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        }
    }
}
