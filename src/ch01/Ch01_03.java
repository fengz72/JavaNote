package ch01;

import java.util.Scanner;

public class Ch01_03 {
    public static void main(String[] args) {
        int line;
        Scanner scanner = new Scanner((System.in));
        line = scanner.nextInt();
        for (int a = 1; a <= line; a++) {
                for (int b = 1; b <=line - a; b++) {
                    System.out.print("  ");
                }
            for (int c = 1; c <= a; c++) {
                if (c<=a-9) {
                    System.out.print(a - c + 1);
                }
                else{
                    System.out.print(" "+(a-c+1));
                }
            }
            for (int d = 1; d <= a - 1; d++) {
                if (d>=10){
                System.out.print((d + 1));
                }
                else{
                    System.out.print(" "+(d+1));
                }
            }
            System.out.print("\n");
        }

    }
}
