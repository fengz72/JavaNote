package Ch12;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integer: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println(number1 / number2);
    }
}
