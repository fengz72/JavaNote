package Ch06;

import java.util.Scanner;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIME; //要输出的素数的个数
        final int NUMBER_OF_PRIME_PER_LINE;

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //用户输入要显示素数的个数
        System.out.print("输入要显示的素数的个数：");
        NUMBER_OF_PRIME = input.nextInt();

        //每行显示的个数
        System.out.print("每行显示素数的个数：");
        NUMBER_OF_PRIME_PER_LINE = input.nextInt();

        //
        printPrimeNumber(NUMBER_OF_PRIME, NUMBER_OF_PRIME_PER_LINE);
    }

    public static void printPrimeNumber(
            int numberOfPrime, int numberOfPrimePerLine) {

        int count = 0;//计数
        int number = 2;//储存素数的值
        while (count < numberOfPrime) {
            if (isPrime(number)) {
                count++;
                //打印
                String s = (count % numberOfPrimePerLine == 0) ? (number + "\n") : number + "";
                System.out.printf("%8s", s);
            }
            number++;
        }

    }

    public static boolean isPrime(int number) {
        if(number <= 1)
            return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
