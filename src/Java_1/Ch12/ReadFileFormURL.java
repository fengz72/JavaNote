package Ch12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFormURL {
    public static void main(String[] args){
        System.out.print("Enter a url: ");
        String URLString = new Scanner(System.in).next();
        //url = http://liveexample.pearsoncmg.com/data/Lincoln.txt
        //http://www.yahoo.com

        try {
            URL url = new URL("http://www.yahoo.com");
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()){
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("The file size is " + count + " characters");
        }catch (MalformedURLException ex){
            System.out.println("Invalid URL");
        } catch (IOException e) {
            System.out.println("I/O Errors: no such file");
        }
    }
}
