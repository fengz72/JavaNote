package Ch06;

import java.util.Scanner;

public class Ch06_17 {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //用户输入
        System.out.print("输入矩阵的行列n：");
        int n = input.nextInt();
        //调用方法打印
        printMatrix(n);
    }

    public static void printMatrix(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                int number = (int)(Math.random() * 2);
                System.out.printf("%-3d",number);
            }
            System.out.println();
        }
    }
}
