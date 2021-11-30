package Ch05;

import java.util.Scanner;

public class Ch05_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入一个1-15的整数：");
        int line = input.nextInt();

        for (int i = 1 ; i <= line ; i++){
            for (int a = 1 ; a <= (line - i) ; a++)
                System.out.printf("%4s"," ");

            for (int b = 1 ; b <= i ; b++)
                System.out.printf("%4d",i - b + 1);

            for (int c = 1 ; c < i ; c++)
                System.out.printf("%4d", c + 1);

            for (int d = 1 ; d <= line ; d++)
                System.out.printf("%4s"," ");

            System.out.println();
        }

    }
}
