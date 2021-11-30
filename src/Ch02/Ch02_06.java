package Ch02;

import java.util.Scanner;

public class Ch02_06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of 1-1000: ");
        int number = input.nextInt();
        int firstNumber = number / 100;
        int excess1 = number % 100;
        int secondNumber = excess1 / 10;
        int lastNumber = excess1 %10;
        int plus = firstNumber + secondNumber + lastNumber;
        System.out.println(plus);


    }
}
