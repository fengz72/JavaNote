package Ch09;

import java.util.Scanner;

public class Ch09_13 {
    public static void main(String[] args){
        int row, column;
        double[][] a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        row = input.nextInt();
        column = input.nextInt();

        a = new double[row][column];
        System.out.println("Enter the array: ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++)
                a[i][j] = input.nextDouble();
        }

        Location location = Location.locateLargest(a);
        System.out.println("The location of the largest element is " + location.maxValue + " at " + "(" + location.row + ", " + location.column + ")");
    }
}

class Location{
    public int row;
    public int column;
    public double maxValue;


    public static Location locateLargest(double[][] a){
        Location location = new Location();

        location.maxValue = a[0][0];

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                if (a[i][j] > location.maxValue){
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        return location;
    }
}
