package Ch05;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //提示用户输入两个整数
        System.out.print("输入两个整数: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        //
        int gcd = 1;
        for (int i = 1;(i <= n1 && i <= n2);i++){
            if ((n1 % i == 0) && (n2 % i == 0))
                gcd = i;
        }
        System.out.println(n1 + " and " + n2 + " greatestcommondivisor is " +gcd);
    }
}
