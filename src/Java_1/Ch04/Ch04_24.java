package Ch04;

import java.util.Scanner;

public class Ch04_24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();
        //比较
        int city1Tocity2 = city1.compareToIgnoreCase(city2);
        int city2Tocity3 = city2.compareToIgnoreCase(city3);
        int city3Tocity1 = city3.compareToIgnoreCase(city1);
        if (city2Tocity3 > 0 && city3Tocity1 < 0){
            if (city1Tocity2 > 0)
                System.out.println("The three cities in alphabetical order are " + city3 + " " + city2 + " " + city1);
            else
                System.out.println("The three cities in alphabetical order are " + city3 + " " + city1 + " " + city2);
        }
        else if (city1Tocity2 > 0 && city2Tocity3 < 0){
            if(city3Tocity1 < 0)
                System.out.println("The three cities in alphabetical order are " + city2 + " " + city3 + " " + city1);
            else
                System.out.println("The three cities in alphabetical order are " + city2 + " " + city1 + " " + city3);
        }
        else{
            if (city2Tocity3 > 0)
                System.out.println("The three cities in alphabetical order are " + city1 + " " + city3 + " " + city2);
            else
                System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
        }

    }
}
