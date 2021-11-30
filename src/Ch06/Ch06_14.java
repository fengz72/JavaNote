package Ch06;

import java.util.Scanner;

public class Ch06_14 {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //用户输入i
        System.out.print("Enter an integer: ");
        int i = input.nextInt();
        //打印
        System.out.printf("%-4s%10s%10s\n", "i", " ", "m(i)");
        System.out.printf("%24s\n", "------------------------");

        for (int a = 1; a <= i * 100; a += 100) {
            System.out.printf("%-4d%10s%10.4f\n", a, " ", m(a));
        }
    }

    //估算pi
    public static double m(int i){
        double pi = 0;

        for (int a = 1; a <= i; a++){
            pi += 4 * Math.pow(-1 , a + 1) / (2 * a - 1);
        }
        return pi;
    }
}
