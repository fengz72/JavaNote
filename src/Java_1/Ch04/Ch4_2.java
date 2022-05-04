package Ch04;

import java.util.Scanner;

public class Ch4_2 {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //输入两个点坐标
        System.out.print("输入第一个点的经纬度，例如x1, y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("输入第二个点的经纬度，例如x2, y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        //角度转换为弧度
        double x1Radians = Math.toRadians(x1);
        double y1Radians = Math.toRadians(y1);
        double x2Radians = Math.toRadians(x2);
        double y2Radians = Math.toRadians(y2);
        //计算距离
        double r = 6371.01;
        double d1 = r * Math.acos(Math.sin(x1Radians) * Math.sin(x2Radians) + Math.cos(x1Radians) *
                Math.cos(x2Radians) * Math.cos(y1Radians - y2Radians));
        double d2 = r * Math.acos(Math.sin(x1Radians) * Math.sin(x2Radians) + Math.cos(x1Radians) *
                Math.cos(x2Radians) * Math.cos(Math.toRadians(y1 - y2)));
        System.out.printf("(" + x1 + " , " + y1 + ")" + "与" + "(" + x2 + " , " + y2 + ")" + "的距离为： " + "%10.4f\n", d1);
        System.out.println(d2);
    }
}
