package Ch08;

import java.util.Scanner;

public class PassTwoDimensionalArray {
    public static void main(String[] args){
        int[][] m = getArray();

        System.out.println(sum(m));
    }

    public static int[][] getArray(){
        //
        Scanner input = new Scanner(System.in);
        //
        int[][] m = new int[3][4];
        System.out.print("Enter " + m.length + " rows and " + m[0].length + " columns: ");
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextInt();
        }

        return m;
    }

    public static int sum(int[][] m){
        int total = 0;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++)
                total += m[i][j];
        }

        return total;
    }
}
