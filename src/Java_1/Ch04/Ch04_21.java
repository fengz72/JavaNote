package Ch04;

import java.util.Scanner;

public class Ch04_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String ssn = input.nextLine();
        if (ssn.indexOf('-') == 3 && ssn.lastIndexOf('-') == 6){
            System.out.println(ssn + "is a valid social security number");
        }
        else System.out.println(ssn + "is an invalid social security number");
    }
}
