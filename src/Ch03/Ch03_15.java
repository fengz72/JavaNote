package Ch03;

import java.util.Scanner;

public class Ch03_15 {
    public static void main(String[] args){
        int prize,a1,a2,a3,b1,b2,b3;
        //得到三位随机数字
        int lottery = (int)(Math.random() * 1000);
        int firstLottery = lottery / 100;
        int secondLottery = (lottery / 10) % 10;
        int thirdLottery = lottery % 10;
        System.out.println("中奖号码为：" + firstLottery + " " + secondLottery + " " + thirdLottery);
        //提示用户输入三位数字
        Scanner input = new Scanner(System.in);
        System.out.print("输入1-999之中的一个数字，例如008，021, 211： ");
        int userLottery = input.nextInt();
        int firstUserLottery = userLottery / 100;
        int secondUserLottery = (userLottery / 10) % 10;
        int thirdUserLottery = userLottery % 10;
        //重排
        if(firstUserLottery >= thirdUserLottery && secondUserLottery >= thirdUserLottery){
            if (firstUserLottery >= secondUserLottery){
                a1 = firstUserLottery ;
                a2 = secondUserLottery;
                a3 = thirdUserLottery;
            }
            else {
                a1 = secondUserLottery;
                a2 = firstUserLottery;
                a3 = thirdUserLottery;
            }
        }
        else if(firstUserLottery >= secondUserLottery && thirdUserLottery >= secondUserLottery){
            if(firstUserLottery >= thirdUserLottery){
                a1 = firstUserLottery;
                a2 = thirdUserLottery;
                a3 = secondUserLottery;
            }
            else {
                a1 = thirdUserLottery;
                a2 = firstUserLottery;
                a3 = secondUserLottery;
            }
        }
        else if(secondUserLottery >= firstUserLottery && thirdUserLottery >= firstUserLottery){
            if(thirdUserLottery >= secondUserLottery){

            }
        }

        //比较
        int number = Math.abs(lottery - userLottery);

        int firstNumber = firstLottery - firstUserLottery;
        int secondNumber = secondLottery - secondUserLottery;
        int thirdNumber = thirdLottery - thirdUserLottery;
        //判断

        if (number == 0) prize = 10000;
        else if(firstLottery == firstUserLottery ^ secondLottery == secondUserLottery) prize= 3000;
        else if(firstNumber == 0 || secondNumber == 0 || thirdNumber == 0) prize = 1000;
        else prize = 0;
        System.out.println("The prize is: " + prize + " $");
    }
}
