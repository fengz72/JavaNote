package Ch06;

import java.util.Scanner;

public class Ch06_05 {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //用户输入
        System.out.print("输入一个数：");
        double num1 = input.nextDouble();
        System.out.print("输入一个数：");
        double num2 = input.nextDouble();
        System.out.print("输入一个数：");
        double num3 = input.nextDouble();
        //
        displaySortedNumbers(num1,num2,num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
        if (num1 >= num3 && num2 >= num3){
            if (num1 >= num2)
                System.out.println(num1 + " " + num2 + " " + num3);
            else
                System.out.println(num2 + " " + num1 + " " + num3);
        }
        else if (num1 >= num2 && num3 >= num2){
            if (num1 >= num3)
                System.out.println(num1 + " " + num3 + " " + num2);
            else
                System.out.println(num3 + " " + num1 + " " + num2);
        }
        else {
            if (num2 >= num3)
                System.out.println(num2 + " " + num3 + " " + num1);
            else
                System.out.println(num3 + " " + num2 + " " + num1);
        }
    }
}
