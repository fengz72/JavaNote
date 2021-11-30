package Ch03;

import java.util.Scanner;

public class Ch03_19 {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //输入
        System.out.print("输入三角形的边长，例如4 5 6: ");
        float a = input.nextFloat();;
        float b = input.nextFloat();
        float c = input.nextFloat();
        //
        if (a + b > c && a + c > b && b + c > a){
            System.out.println("三角形的周长为： " + (a + b + c));
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
