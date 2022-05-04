package Ch04;

import java.util.Scanner;

public class OrderTwoCities {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a city: ");
        String city1 = input.nextLine();
        System.out.print("Enter another city: ");
        String city2 = input.nextLine();
        if (city1.compareToIgnoreCase(city2) < 0){
            System.out.println(city1 + " " + city2);
        }
        else System.out.println(city2 + " " + city1);
        int length = city1.length();
        String massage = city1.substring(0,length);
        System.out.println(massage);
    }
}
