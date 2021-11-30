package Ch06;

import java.util.Scanner;

public class Ch06_18 {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //输入密码
        System.out.print("输入一个密码：");
        String s = input.nextLine();
        //调用方法
        if (isValidPassword(s))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }

    public static boolean isValidPassword(String s){
        boolean isValidPassword = true;
        int count = 0;
        //判断长度是否为8
        if (s.length() < 8) {
            isValidPassword = false;
        }

        for (int i = 0; i < s.length(); i++){
            //判断是否为英文或者数字
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                isValidPassword = false;
            }
            //判断数字的个数
            if (Character.isDigit(s.charAt(i))){
                count++;
            }
        }

        if (count < 2)
            isValidPassword = false;


        return isValidPassword;
    }
}
