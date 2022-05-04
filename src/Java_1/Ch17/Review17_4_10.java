package Ch17;

import java.io.*;

public class Review17_4_10 {
    public static void main(String[] args) {
//        try (
//                FileInputStream input = new FileInputStream("test.dat")
//        ) {
//
//        } catch (FileNotFoundException ex) {
//
//        } catch (IOException ex) {
//
//        }

        try (PrintWriter output = new PrintWriter("test/t.txt")){
            output.printf("%s", "1234");
            output.printf("%s", "5678");
        }catch (IOException ex){

        }

        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("test/t.dat"))){
            output.writeInt(1234);
            output.writeInt(5678);
            output.writeChar('A');
            output.writeUTF("DEF");
        }catch (IOException ex){

        }

    }
}
