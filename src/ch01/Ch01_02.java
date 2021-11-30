package ch01;

import java.util.Scanner;

public class Ch01_02 {
    public static void main(String args[]){
        double line;
        Scanner scanner=new Scanner((System.in));
        line= scanner.nextDouble();
        for(int a=1;a<=line;a++){
            for(int b=1;b<=line-a;b++){
                System.out.print(" ");
            }
            for(int c=1;c<=2*a-1;c++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
