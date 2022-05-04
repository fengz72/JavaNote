package Ch12;

import java.io.File;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception {
        File file = new File("us.txt");

        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String firstName = input.next();
            String mid = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mid + " " + lastName + " " + score);
        }

        input.close();
    }
}
