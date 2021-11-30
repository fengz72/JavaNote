package Ch03;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args){
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        if (number1 < number2){
            int i = number1;
            number1 = number2;
            number2 = i;
        }
        System.out.print("What is " + number1 + " - " + number2 + ": ");
        Scanner input = new Scanner(System.in);
        int studentNumber = input.nextInt();
        if (number1 - number2 == studentNumber) System.out.println("You are correct!");
        else System.out.println("You are wrong, " + number1 + " - " + number2 + " = " + (number1 - number2));
    }
}
