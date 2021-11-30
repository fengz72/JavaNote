package Ch03;

import java.util.Scanner;

public class ComputerAndInterpretBMI {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter weight in pounds and height in inches
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter lenght in Inches: ");
        double heightInInches = input.nextDouble();
        //计算成Kg和m
        double weight = weightInPounds * 0.45359237;
        double height = heightInInches * 0.0254;
        //计算BMI并输出结果
        double bmi = weight / (height * height);
        System.out.println("BMI is " + bmi);
        if (bmi  < 18.5) System.out.println("偏瘦");
        else if(bmi < 25.0) System.out.println("正常");
        else if(bmi < 30.0) System.out.println("超重");
        else {
            System.out.println("过胖");
        }
    }
}
