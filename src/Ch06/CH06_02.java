package Ch06;

import java.util.Scanner;

public class CH06_02 {
    public static void main(String[] args){
       //Create a Scanner
        Scanner input = new Scanner(System.in);
        //用户输入整数
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        //调用方法并输出
        System.out.println(sumDigits(n));
    }

    public static int sumDigits(long n){
        int sumDigits = 0;
        int i = 0;
        while (n != 0){
            sumDigits += n % 10;
            n /= 10;
        }
        return sumDigits;
    }
}
