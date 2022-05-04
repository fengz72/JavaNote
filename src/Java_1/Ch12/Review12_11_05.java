package Ch12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Review12_11_05 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner("you.txt");
        input.nextLine();
        File file = new File("us.txt");
        PrintWriter output = new PrintWriter(file);
        output.println("HEJUN");
        output.close();
    }
}
