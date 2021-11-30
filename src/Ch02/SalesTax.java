package Ch02;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter purchase amount");
        double purchaseAmount = input.nextDouble();
        double tax = purchaseAmount * 0.06;
        System.out.println("Tax is: " + (int)(tax * 100 + 0.5) / 100.0);
        float f = 12.5F;
        int i = (int)f;
        double amount = 5;
        System.out.println(f);
        System.out.println(i);
        System.out.println(amount / 2);
    }
}
