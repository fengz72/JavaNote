package Ch04;

import java.util.Scanner;

public class Ch04_26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double for example 11.56: ");
        String amount = input.nextLine();
        //将整数与小数分开
        int location = amount.indexOf('.');
        String amount1 = amount.substring(0,location);
        String amount2 = amount.substring(location + 1);
        //化为int
        int intAmount1 = Integer.parseInt(amount1);
        int intAmount2 = Integer.parseInt(amount2);
        //计算
        int dollar = intAmount1;
        int quarter = intAmount2 / 25;
        int remain1 = intAmount2 % 25;
        int dime = remain1 / 10;
        int remain2 = remain1 % 10;
        int nickel = remain2 / 5;
        int penny = remain2 % 5;
        //输出
        System.out.println(dollar + " " + quarter + " " + dime + " " + nickel + " " + penny);
    }
}
