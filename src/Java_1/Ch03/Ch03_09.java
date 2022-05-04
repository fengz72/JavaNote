package Ch03;

import java.util.Scanner;

public class Ch03_09 {
    public static void main(String[] args){
        int plus = 0;
        int d10 = 0;
        int a[] = new int[9];
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //用户输入
        System.out.print("输入一个九位数的值：");
        int number = input.nextInt();
        int number1 = number;
        //分解数字
        for (int i=0;i<=8;i++){
            a[i] = number % 10;
            number /= 10;
            plus = plus + a[i] * (9-i);
        }
        d10 = plus % 11;
        System.out.print("The ISBN-10 number is " + number1);
        System.out.println((d10 == 10) ? "X" : d10);
    }
}
