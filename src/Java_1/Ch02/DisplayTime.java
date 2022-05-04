package Ch02;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Prompt the user for input
        System.out.print("Enter an integer for seconds: ");
        int seconds = input.nextInt();
        int minutes = seconds / 60;
        int remainingSecongds = seconds % 60;
        System.out.println(seconds + "seconds is " + minutes + " minutes " + remainingSecongds + " seconds.");
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(2,-2));
        System.out.println(Math.pow(2,0.3));
        System.out.println(2 * 5 / 2 + 2 * 5 /2);
        System.out.println(25 / 4.0);
        int m = input.nextInt();
        int r = input.nextInt();
        double number = m * Math.pow(r,2);
        double number1 = m * r^3;
        System.out.println(number);
        System.out.println(number1);
        System.out.println(0B1111);
        System.out.println(0711);
        System.out.println(0XFFFFf);
        double d = 12.654321E2;
        System.out.println(d);
    }
}
