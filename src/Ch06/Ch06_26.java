package Ch06;

import java.util.Scanner;

public class Ch06_26 {
    public static void main(String[] args){
        final int NUMBER_OF_PALINDROME_PRIME; //要输出的回素数的个数
        final int NUMBER_OF_PALINDROME_PRIME_PER_LINE;

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //用户输入要显示回素数的个数
        System.out.print("输入要显示的素数的个数：");
        NUMBER_OF_PALINDROME_PRIME = input.nextInt();

        //每行显示的个数
        System.out.print("每行显示素数的个数：");
        NUMBER_OF_PALINDROME_PRIME_PER_LINE = input.nextInt();

        print(NUMBER_OF_PALINDROME_PRIME,NUMBER_OF_PALINDROME_PRIME_PER_LINE);
    }

    public static void print(int totalNumber, int numberPerLine){
        int count = 0;
        int number = 2;
        while (count < totalNumber){
            if(isPalindromePrime(number)){
                count++;
                //打印
                String s = (count % numberPerLine == 0) ? (number + "\n") : number + "";
                System.out.printf("%8s", s);
            }
            number++;
        }
    }

    public static boolean isPalindromePrime(int number){
        boolean isPalindromePrime;

        isPalindromePrime = PrimeNumberMethod.isPrime(number) && Ch06_03.isPalindrome(number);

        return isPalindromePrime;
    }
}
