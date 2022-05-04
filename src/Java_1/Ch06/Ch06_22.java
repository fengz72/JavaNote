package Ch06;

import java.util.Scanner;

public class Ch06_22 {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //用户输入
        System.out.print("输入一个数字：");
        long n = input.nextLong();
        //调用方法
        System.out.printf("%1d%1s%5.4f",n , " 的平方根为：" , sqrt(n));
    }

    public static double sqrt(long n){
        final double EPSILON = 0.0001;
        double lastGuess;
        double nextGuess = 1;
        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }while (Math.abs(lastGuess - nextGuess) > EPSILON);

        return nextGuess;
    }
}
