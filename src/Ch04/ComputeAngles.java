package Ch04;

import java.util.Scanner;

public class ComputeAngles {
    public static void main(String[] args){
        java.util.Scanner input = new Scanner(System.in);
        //用户输入三个坐标
        System.out.print("输入三个坐标: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        //计算三边长度
        double a = Math.sqrt(Math.pow(x2 - x3,2) + Math.pow(y2 - y3,2));
        double b = Math.sqrt(Math.pow(x1 - x3,2) + Math.pow(y1 - y3,2));
        double c = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
        //计算三个角度
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * b * a)));
        //输出
        System.out.println("三个角分别为: " + Math.round(A * 100) / 100.0 + " "
                + Math.round(B * 100) / 100.0 + " "
                + Math.round(C * 100) / 100.0);
    }
}
