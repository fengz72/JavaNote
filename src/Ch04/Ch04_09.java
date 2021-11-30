package Ch04;

import java.util.Scanner;

public class Ch04_09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String a = input.next();
        char b = a.charAt(0);
        int c = b;
        System.out.println("The Unicode for the character " + b + " is " + c);
    }
}
