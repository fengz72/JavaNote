package Ch04;

import java.util.Scanner;

public class Ch04_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();
        char firstString = month.charAt(0);
        if (firstString >= 'A' && firstString <= 'Z'){
            if(month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul")
                    || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")){
                System.out.println(month + " " + year + " has 31 days");
            }
        /*    else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
                if (month.equals("Feb")){
                    System.out.println(month + " " + year + " has 29 days");
                }
                else {
                    System.out.println(month + " " + year + " has 30 days");
                }
            }
            else {
                if (month.equals("Feb")){
                    System.out.println(month + " " + year + " has 28 days");
                }
                else {
                    System.out.println(month + " " + year + " has 30 days");
                }
            }*/
            else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) && (month.equals("Feb"))){
                System.out.println(month + " " + year + " has 29 days");
            }
            else if(month.equals("Feb") && ( !(( (year % 4 == 0) && (year % 100 == 0) ) || (year % 400 == 0)) ) ){
                System.out.println(month + " " + year + " has 28 days");
            }
            else{
                System.out.println(month + " " + year + " has 30 days");
            }
        }
        else System.out.println(month + " is not a correct month name");
    }
}
