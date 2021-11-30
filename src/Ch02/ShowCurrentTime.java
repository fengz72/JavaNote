package Ch02;

import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args){
        long totalMilliseconds = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        System.out.print("输入所在时区相对于GMT的偏移量，例如-5：");
        int relativeTime = input.nextInt();
        long totalSeconds = totalMilliseconds / 1000;//得到秒
        int currentSeconds = (int)totalSeconds % 60;//得到当前秒钟

        long totalMinutes = totalSeconds / 60;
        int currentMinutes = (int)totalMinutes % 60;//当前分钟

        long totalHoursGMT = totalMinutes / 60;//总GMT小时
        long totalHours = totalHoursGMT + relativeTime;//总当前小时
        int currentHours = (int)totalHours % 24;//当前小时
        System.out.println("Current time is " + currentHours + " : " + currentMinutes + " : " + currentSeconds + " BeiJing.");
    }
}
