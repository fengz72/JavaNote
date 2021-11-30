package Ch02;

import java.util.Scanner;

public class Ch02_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingMoney = input.nextDouble();
        double accountValue = 0;
        for (int i = 1;i <= 6;i++){
            accountValue = (100 + accountValue) * (1 + 0.00417);
        }
        System.out.println("After the sixth month, the account value is $" + (int)(accountValue * 100) / 100.0);
    }
}
