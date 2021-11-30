package Ch02;

import java.util.Scanner;

public class Ch02_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //输入费用
        System.out.print("请输入费用：");
        double money = input.nextDouble();
        //输入利润
        System.out.print("输入小费费率，例如1.5：");
        double rate = input.nextDouble();
        //计算小费和总费用
        double tip = money * (rate / 100);
        double totalMoney = tip + money;
        //输出
        System.out.println("小费是：" + tip);
        System.out.println("总费用为：" + totalMoney);
    }
}
