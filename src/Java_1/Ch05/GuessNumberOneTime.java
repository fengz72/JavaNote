package Ch05;

import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args){
        int number = (int) (Math.random() * 101);//产生随机数
        Scanner input = new Scanner(System.in);
        //循环
        int userNumber = 0;
        while(number != userNumber){
            System.out.print("Enter a 0-100 number: ");
            userNumber = input.nextInt();

            if (number > userNumber){
                System.out.println("Your guess is too low");
            }
            else if (number < userNumber)
                System.out.println("Your guess is too high");
            else
                System.out.println("Yes, the number is: " + number);
        }
    }
}
