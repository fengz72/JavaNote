package Ch10;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String s = input.nextLine();

        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s){
        String s1 = filter(s);

        String s2 = reverse(s1);

        return s1.equals(s2);
    }

    public static String filter(String s){
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++){
            if (!Character.isLetterOrDigit(sb.charAt(i)))
                sb.deleteCharAt(i);
        }

        return sb.toString();
    }

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
