package Ch08;

import java.util.Scanner;

public class FindNearestPoints {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberPoints = input.nextInt();

        double[][] points = new double[numberPoints][2];
        System.out.println("Enter " + numberPoints + " of points: ");
        for (int i = 0; i < points.length; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int indexOfPoint1 = 0;
        int indexOfPoint2 = 1;
        double shortestDistance = distance(points[indexOfPoint1][0],points[indexOfPoint1][1],
                points[indexOfPoint2][0],points[indexOfPoint2][1]);


        for (int i = 0; i < points.length; i++){
            for (int j = i + 1; j < points.length; j++){
                double distance = distance(points[i][0],points[i][1],points[j][0],points[j][1]);
                if (distance < shortestDistance){
                    shortestDistance = distance;
                    indexOfPoint1 = i;
                    indexOfPoint2 = j;
                }
            }
        }

        System.out.println("The closest two points are " + "(" + points[indexOfPoint1][0] + "," +
                points[indexOfPoint1][1] + ") and (" + points[indexOfPoint2][0] + "," + points[indexOfPoint2][1] + ")");
        System.out.println("The short distance is: " + shortestDistance);
    }

    public static double distance(double x1, double y1, double x2, double y2){
        double distance = 0;
        distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return distance;
    }
}
