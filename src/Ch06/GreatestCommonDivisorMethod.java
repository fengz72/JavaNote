package Ch06;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //提示用户输入
        System.out.print("Enter first integer:");
        int n1 = input.nextInt();
        System.out.print("Enter second integer:");
        int n2 = input.nextInt();
        //调用公约数方法
        int gcd = gcd(n1,n2);
        System.out.println(n1 + " " + n2 + "的公约数为：" + gcd);
    }

        public static int gcd(int n1,int n2){
            int gcd = 1;
            int k = 2;

            while (k <= n1 && k <= n2){
                if (n1 % k == 0 && n2 % k ==0)
                    gcd = k;
                k++;
            }
            return gcd;
        }

}
