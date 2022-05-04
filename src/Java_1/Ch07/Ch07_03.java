package Java_1.Ch07;

import java.util.Scanner;
import java.lang.System;

public class Ch07_03 {
    public static void main(String[] args) {
        int[] array1 = new int[100];
        int endNumber = 1;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        while (endNumber != 0) {
            endNumber = input.nextInt();
            array1[count] = endNumber;
            count++;
        }

        //将array1中储存的数给array2
        int[] array2 = new int[count - 1];
        java.lang.System.arraycopy(array1, 0, array2, 0, array2.length);
        int[] array3 =  count(array2);

        //
        print(array3);


    }

    public static int[] count(int[] array){
        int[] to100Integer = new int[100];

        for (int i = 0; i < array.length; i++){
            if (array[i] != 0){
                to100Integer[array[i] - 1]++;
            }
        }

        return to100Integer;
    }

    public static void print(int[] array){
        System.out.println();
        for (int i =0; i < array.length; i++){
            if (array[i] > 1)
                System.out.println((i + 1) + " " + " occurs " + array[i] + " times");
            else if (array[i] == 1)
                System.out.println((i + 1) + " " + " occurs " + array[i] + " time");
        }
    }
}
