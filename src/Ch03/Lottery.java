package Ch03;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args){
        int prize;
        //得到两位随机数字
        int lottery = (int)(Math.random() * 100);
        int firstLottery = lottery / 10;
        int secondLottery = lottery % 10;
        System.out.println("中奖号码为：" + firstLottery + " " + secondLottery);
        //提示用户输入两位数字
        Scanner input = new Scanner(System.in);
        System.out.print("输入1-99之中的一个数字，例如08，21： ");
        int userLottery = input.nextInt();
        int firstUserLottery = userLottery / 10;
        int secondUserLottery = userLottery % 10;
        //判断
        if (firstLottery == firstUserLottery && secondLottery == secondUserLottery) prize = 10000;
        else if(firstLottery == firstUserLottery ^ secondLottery == secondUserLottery) prize= 1000;
        else if(firstLottery == secondUserLottery && secondLottery == firstUserLottery) prize = 3000;
        else prize = 0;
        System.out.println("The prize is: " + prize + " $");
    }
}
