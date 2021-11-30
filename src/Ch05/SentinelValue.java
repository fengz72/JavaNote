package Ch05;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sub = 0;
        int data = 1;
        while (data != 0) {
            data = 0;
            System.out.print("Enter an integer (the input if it is 0): ");
            data = input.nextInt();
            sub += data;
        }
        System.out.println(sub);
    }
}
