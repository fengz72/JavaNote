package Cbook;
/***
 * Ax = b, x ∈ ℜ矩阵 A ∈ ℜn×n 和向量 b ∈ ℜn 为已知的观察值，x 为待求变量。
 * 一般我们还假定矩阵 A 是满秩的。
 * 当矩阵 A 的行向量个数大于列向量的个数时，一般而言线性方程组没有精确解，此时我们需要求其最佳逼近最小二乘解，我们把这部分内容放到第二章的最小二乘部分。
 * 当矩阵 A 的行变量个数小于列变量个数时，此时线性方程组具有无穷多解或者无解。
 * 当具有无穷多解时，我们一般加上变量与原点的最短距离约束，即 minx∈ℜn ∥x∥，
 * 转化为一个带线性约束的二次规划问题:min x∈ℜn ∥x∥, subject to Ax = b.
 *这部分内容我们将放到第六章的非线性优化部分进行讨论。
 *
 */

import java.util.Scanner;

/***
 * 直接法
 * 迭代法
 */

public class Cramer {
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //用户输入矩阵n*m
        System.out.print("输入矩阵的行n：");
        int n = input.nextInt();
        System.out.print("输入矩阵的列m：");
        int m = input.nextInt();

        double data[][] = new double[n -1][m - 1];
        double b[] = new double[n - 1];
        double x[] = new double[m - 1];
        for (int j = 0;j < m ;j++){
            for (int i = 0;i < n;i++)
                data[i][j] = input.nextDouble();
        }

        for (int i = 0;i < n;i++)
            b[i] = input.nextDouble();

        for (int i = 0;i < m;i++){
            double A[][] = new double[n - 1][m - 1];

        }

    }

}
