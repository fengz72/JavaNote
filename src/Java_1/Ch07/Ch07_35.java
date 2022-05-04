package Java_1.Ch07;

import java.util.Scanner;

public class Ch07_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"program","write", "that"};
        int count = 0;
        boolean isContinue = false;
        do {
            print(words[count]);
            System.out.print("Do you want to guess another word? Enter y or n> ");
            String s = input.next();
            isContinue = (s.charAt(0) == 'y')? true : false;
            count++;
        }while ((count < words.length) && isContinue);

    }

    public static void print(String s) {
        int count = 0;
        char[] chArray = new char[s.length()];
        char[] sChArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chArray[i] = '*';
            sChArray[i] = s.charAt(i);
        }

        do {
            //打印标头
            System.out.print("(Guess) Enter a letter in word ");
            for (char e : chArray)
                System.out.print(e);
            System.out.print(" >");

            Scanner input = new Scanner(System.in);
            String userIn = input.next();
            char ch = userIn.charAt(0);

            boolean isMatch = false;
            for (int i = 0; i < s.length(); i++) {
                if (ch == chArray[i]){
                    System.out.println("    " + ch + " is already in the word");
                    isMatch = true;
                }
                if (ch == s.charAt(i)) {
                    chArray[i] = ch;
                    isMatch = true;
                }
            }

            if (!isMatch){
                System.out.println("    " + ch + " is not in the word");
                count++;
            }
        } while (!java.util.Arrays.equals(chArray, sChArray));

        System.out.println("The wore is " + s + ". You missed " + count + " time");
    }
}
