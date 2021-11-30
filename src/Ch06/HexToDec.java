package Ch06;

import java.util.Scanner;

public class HexToDec {
    public static void main(String[] args){

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //输入一个十六进制数字
        System.out.print("Enter a Hex Integer: ");
        String s = input.nextLine();

        //
        System.out.println(s + " is " + hexToDec(s));
    }

    public static int hexToDec(String hex){
        int decValue = 0;
        for (int i = 0;i < hex.length();i++){
            char hexChar = hex.charAt(i);
            decValue = decValue * 16 + hexCharToDec(hexChar);
        }
        return decValue;
    }

    public static int hexCharToDec(char ch){
        if (ch >= 'A' &&ch <='F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
