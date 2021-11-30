package Ch05;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        int i = 0;
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //用户输入一个单词
        System.out.print("输入一个单词：");
        String s = input.nextLine();
        //得到长度
        int length = s.length() - 1;

        boolean isPalindrome = true;
        while (i <= length /2){
            if (s.toLowerCase().charAt(i) != s.toLowerCase().charAt(length - i)){
                isPalindrome = false;
                break;
            }
            i++;
        }

        //输出
        if (isPalindrome)
            System.out.println("是回数");
        else
            System.out.println("不是回数");
    }
}
