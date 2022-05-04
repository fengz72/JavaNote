package Ch04;

import java.util.Scanner;

public class Ch04_03 {
    public static void main(String[] args){
        //Create a Scanner
    /*    Scanner input = new Scanner(System.in);
        System.out.print("请输入Georgia州的Atlanta的坐标： ");
        double cityX1 = input.nextDouble();
        double cityY1 = input.nextDouble();
        System.out.print("请输入Florida州的Orlando的坐标： ");
        double cityX2 = input.nextDouble();
        double cityY2 = input.nextDouble();
        System.out.print("请输入Georgia州的Savannah的坐标： ");
        double cityX3 = input.nextDouble();
        double cityY3 = input.nextDouble();
        System.out.println("请输入North Carolina州的Charlotte的坐标： ");
        double cityX4 = input.nextDouble();
        double cityY4 = input.nextDouble();
     */
        double cityX1 = 33.7489954;
        double cityY1 = -84.3879824;
        double cityX2 = 28.5383355;
        double cityY2 = -81.3792365;
        double cityX3 = 32.0835407;
        double cityY3 = -81.0998342;
        double cityX4 = 35.2270869;
        double cityY4 = -80.8431267;
        //Dpdk intel nfv
        //角度转化成弧度
        double cityX1Radians = Math.toRadians(cityX1);
        double cityY1Radians = Math.toRadians(cityY1);
        double cityX2Radians = Math.toRadians(cityX2);
        double cityY2Radians = Math.toRadians(cityY2);
        double cityX3Radians = Math.toRadians(cityX3);
        double cityY3Radians = Math.toRadians(cityY3);
        double cityX4Radians = Math.toRadians(cityX4);
        double cityY4Radians = Math.toRadians(cityY4);
        //计算距离
        double r = 6371.01;
        double d1To2 = r * Math.acos(Math.sin(cityX1Radians) * Math.sin(cityX2Radians) + Math.cos(cityX1Radians) *
                Math.cos(cityX2Radians) * Math.cos(cityY1Radians - cityY2Radians));
        double d2To3 = r * Math.acos(Math.sin(cityX2Radians) * Math.sin(cityX3Radians) + Math.cos(cityX2Radians) *
                Math.cos(cityX3Radians) * Math.cos(cityY2Radians - cityY3Radians));
        double d3To4 = r * Math.acos(Math.sin(cityX3Radians) * Math.sin(cityX4Radians) + Math.cos(cityX3Radians) *
                Math.cos(cityX4Radians) * Math.cos(cityY3Radians - cityY4Radians));
        double d4To1 = r * Math.acos(Math.sin(cityX1Radians) * Math.sin(cityX4Radians) + Math.cos(cityX1Radians) *
                Math.cos(cityX4Radians) * Math.cos(cityY1Radians - cityY4Radians));
        double d1To3 = r * Math.acos(Math.sin(cityX1Radians) * Math.sin(cityX3Radians) + Math.cos(cityX1Radians) *
                Math.cos(cityX3Radians) * Math.cos(cityY1Radians - cityY3Radians));
        //计算面积
        double p1 = (d1To2 + d2To3 + d1To3) / 2;
        double p2 = (d4To1 + d3To4 + d1To3) / 2;
        double s1 = Math.sqrt(p1 * (p1 - d1To2) * (p1 - d2To3) * (p1 - d1To3));
        double s2 = Math.sqrt(p2 * (p2 - d3To4) * (p2 - d4To1) * (p2 - d1To3));
        double sTotal = s1 + s2;
        System.out.printf("Atlanta, Orlando, Savannah, Charlotte四个城市之间包围的面积为: " + "%10.7f", sTotal);
        System.out.println(" km²");
    }
}
