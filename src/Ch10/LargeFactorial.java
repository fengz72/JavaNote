package Ch10;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println( n + "! = " + factorial(n));
    }

    public static BigInteger factorial(long n){
        BigInteger bigInteger = BigInteger.ONE;
        for (int i = 1; i <= n; i++){
            bigInteger = bigInteger.multiply(new BigInteger(i + ""));
        }
        return bigInteger;
    }
}
