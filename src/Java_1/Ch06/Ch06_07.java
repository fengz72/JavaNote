package Ch06;

import java.util.Scanner;

public class Ch06_07 {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //用户输入
        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double interestRate = input.nextDouble();
        //月回报率
        double monthlyInterestRate = interestRate / 100 / 12;
        //打印
        System.out.printf("%-5s%8s%12s\n","Years"," ","Future Value");
        for (int years = 1; years <= 30; years++){
            double investmentValue = futureInvestmentValue(investmentAmount,monthlyInterestRate,years);

            System.out.printf("%-5d%8s%12.2f\n",years," ",investmentValue);
        }
    }

    public static double futureInvestmentValue(double investmentAmount,double monthlyInterestRate,int years){
        double investmentValue;

        investmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate,years * 12);

        return investmentValue;
    }
}
