package Ch03;

import java.util.Scanner;

public class Ch03_22 {
    public static void main(String[] args){
        //Create a Scanner
        java.util.Scanner input = new Scanner(System.in);
        //用户输入
        System.out.print("请输入x，y： ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        //计算距离
        double distance = Math.pow(x * x + y * y,0.5);
        //判断是否在圆内
        if (distance <= 10)  System.out.println("点 (" + x + " , " + y + ")在圆内");
        else System.out.println("点 (" + x + " , " + y + ")不在圆内");
    }
}
