package Ch06;

import java.util.Scanner;

public class Ch06_06 {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //用户输入
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        //调用方法
        displayPattern(n);
    }

    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++)
                System.out.printf("%4s"," ");

            for (int a = 1; a <= i; a++)
                System.out.printf("%4d",i - a + 1);

            System.out.println();
        }
    }
}
