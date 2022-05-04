package Ch06;

import java.util.Scanner;

public class Ch06_31 {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //输入一串卡号
        System.out.print("输入一串卡号：");
        long card = input.nextLong();
        //
        if (isValid(card) && (sumOfDoubleEvenPlace(card) + sumOfOddPlace(card)) % 10 == 0) {
            System.out.println(card + " is valid.");
        } else
            System.out.println(card + " is invalid.");
    }
    /**Return true if the card number is valid*/
    public static boolean isValid(long number) {
        long firstNumber = getPrefix(number, 1);
        long secondNumber = getPrefix(number, 2);

        if (getSize(number) < 13 || getSize(number) > 16) {
            return false;
        } else {
            if (firstNumber == 4 || firstNumber == 5 || firstNumber == 6)
                return true;
            else if (firstNumber == 3) {
                if (secondNumber == 37)
                    return true;
                else
                    return false;
            } else
                return false;
        }

    }
    /**Get the result from Step2*/
    public static int sumOfDoubleEvenPlace(long number) {
        String numberString = String.valueOf(number);
        int sum = 0;

        for (int i = numberString.length() - 2; i >= 0; i -= 2) {
            sum += getDigit(2 * (numberString.charAt(i) - '0'));
        }

        return sum;
    }

    /**Return this number if it is a single digit,otherwise,
     * return the sum of two digits
     */
    public static int getDigit(int number) {
        if (getSize(number) <= 1)
            return number;
        else {
            return (number % 10 + number / 10);
        }
    }

    /**
     *Return sum of odd-place digits in number
     */
    public static int sumOfOddPlace(long number) {
        String numberString = String.valueOf(number);
        int sum = 0;

        for (int i = numberString.length() - 1; i >= 0; i -= 2) {
            sum += (numberString.charAt(i) - '0');
        }

        return sum;
    }


    /**
     * Return the number of digits in d
     */
    public static int getSize(long d) {
        String dString = String.valueOf(d);
        return dString.length();
    }

    /**
     * Return the first k number of digits frome number. If the
     * number of digits in number is less than k,return number.
     * @param number
     * @param k
     * @return
     */
    public static long getPrefix(long number, int k) {
        String numberString = String.valueOf(number);
        if (numberString.length() < k)
            return number;
        else {
            int temp = 0;
            for (int i = 0; i < k; i++) {
                temp = temp * 10 + (numberString.charAt(i) - '0');
            }
            return temp;
        }
    }
}
