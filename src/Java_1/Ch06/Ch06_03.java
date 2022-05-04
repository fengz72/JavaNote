package Ch06;

import java.util.Scanner;

public class Ch06_03 {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //用户输入一个数字
        System.out.print("Enter an integer to determine whether it is a palindrome: ");
        int number = input.nextInt();

        if (isPalindrome(number))
            System.out.println(number + " is a palindrome");
        else
            System.out.println(number + " is not a palindrome");
    }

    //Return the reversal of an integer,e.g.,reverse(456) returns 654
    public static int reverse(int number){
        String s = number + "";
        String s1 = "";
        int length = s.length();
        for (int i = 0 ; i < length ; i++){
            String s2 = s.substring(length - 1 -i, length - i);
            s1 = s1.concat(s2);
        }
        int reverse = Integer.parseInt(s1);
        return  reverse;
    }

    //Return ture if number is a palindrome
    public static boolean isPalindrome(int number){
        int reverse = reverse(number);
        if (reverse == number)
            return true;
        else
            return false;
    }
}
