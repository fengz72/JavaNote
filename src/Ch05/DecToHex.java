package Ch05;

import java.util.Scanner;

public class DecToHex {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //提示用户输入一个整数
        System.out.print("请输入一个整数：");
        int decValue = input.nextInt();
        //转化为十六进制数
        String hexValue = "";
        if (decValue != 0){
        while (decValue != 0){
            int hex = decValue % 16;
            char hex1 = (0 <= hex && hex <= 9) ? (char)(hex + '0') : (char)((hex - 10) + 'A');
            hexValue = hex1 + hexValue;
            decValue = decValue / 16;
        }
        System.out.println(hexValue);}
        else System.out.println(0);
    }
}
