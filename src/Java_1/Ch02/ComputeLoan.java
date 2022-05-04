package Ch02;

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Enter annual interest rate
        System.out.print("Enter annual interest rate, e.g., 7.25: ");
        double annualInterestRate = input.nextDouble();

        //Enter number of years as an integer
        System.out.print("Enter number of years as an integer, e.g., 5:  ");
        int numberOfYears = input.nextInt();

        //Enter loan amount
        System.out.print("Enter loan amount, e.g., 12000.95: " );
        double loanAmout = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 3600;

        double monthlyPayment = loanAmout * monthlyInterestRate / (1 - (1/Math.pow(1 + monthlyInterestRate,numberOfYears * 12)));
        System.out.println("The monthly payment is " + (int)(monthlyPayment * 100 + 0.5) / 100.0);

        double totalPayment = monthlyPayment * numberOfYears * 12;
        System.out.println("The total payment is " + (int)(totalPayment * 100 + 0.5) / 100.0);

        int a,c;
        a = c = 1;
        double b= Math.pow(20,0.5);
        double i = (-b + Math.pow((Math.pow(b,2) - 4 * a * c), 0.5)) / 2 * a;
        System.out.println(i);
    }
}
