package Ch05;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args){
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);//得到两个随机数

        System.out.print(number1 + " + " + number2 + " is: ");
        Scanner input = new Scanner(System.in);
        int userAnswer = input.nextInt();//用户输入

        while(userAnswer != (number1 + number2)){
            System.out.print("Wrong answer, try again, " + number1 + " + " + number2 + " is: ");
            userAnswer = input.nextInt();
        }
        System.out.println("The answer is right," + number1 + " + " + number2 + " is: " + userAnswer);
    }
}
