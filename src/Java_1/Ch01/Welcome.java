package ch01;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        int max;
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        max = (num1 > num2) ? num1 : num2;
    }

}
