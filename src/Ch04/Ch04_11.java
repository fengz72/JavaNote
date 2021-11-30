package Ch04;

import java.util.Scanner;

public class Ch04_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value ( 0 - 15 ): ");
        int number = input.nextInt();
        if (number <= 9){
            System.out.println("The hex value is " + number);
        }
        else {
            char hex = (char) (number + 55);
            System.out.println("The hex value is " + hex);
        }
    }
}
