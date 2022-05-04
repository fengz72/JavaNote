package Java_1.Ch07;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //用户输入
        System.out.print("输入数组的长度：");
        int length = input.nextInt();
        //新建数组
        double[] array1 = new double[length];
        //随机产生0-100之间的100个数,并计算和
        double sum = 0;
        for (int i = 0; i < array1.length; i++){
            array1[i] = Math.random() * 100;
            sum += array1[i];
        }
        //计算平均值
        double average = sum / length;
        System.out.println(average);
        //找出大于平均值的数
        int count = 0;
        for (int i = 0; i < array1.length; i++){
            if (array1[i] > average){
                System.out.printf("%2d%10.4f\n",i,array1[i]);
                count++;
            }
        }
        System.out.println();
        System.out.print(count);
    }
}
