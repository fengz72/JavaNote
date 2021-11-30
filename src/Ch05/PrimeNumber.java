package Ch05;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIME;//要输出的素数的个数
        final int NUMBER_OF_PRIME_PER_LINE;

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //用户输入要显示素数的个数
        System.out.print("输入要显示的素数的个数：");
        NUMBER_OF_PRIME = input.nextInt();

        //每行显示的个数
        System.out.print("每行现实的个数：");
        NUMBER_OF_PRIME_PER_LINE = input.nextInt();

        int count = 0;//计数
        int number = 2;//储存素数的值
        while (count < NUMBER_OF_PRIME) {
            //判断是否为素数
            int a = 0;
            int i = 1;
            while (i <= number) {
                if (number % i == 0) {
                    a += i;
                }
                i++;
            }
            if (a == number + 1) {
                count++;

                /**
                 * if (count % NUMBER_OF_PRIME_PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.printf("%-5d", number);
             */
                String s = (count % NUMBER_OF_PRIME_PER_LINE == 0) ? (number + "\n" ) : number + "";
                System.out.printf("%8s",s);
            }
            number++;
        }
    }
}
