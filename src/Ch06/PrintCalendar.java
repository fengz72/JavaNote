package Ch06;

import java.util.Scanner;

public class PrintCalendar {
    /** Main method*/
    public static void main(String[] args){
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        int year;
        int month;

        //用户输入
        do {
            System.out.print("Enter full year (eg.,2012): ");
            year = input.nextInt();
            System.out.print("Enter a month (eg.,3): ");
            month = input.nextInt();
        }while (! isRightInput(year,month));

        //打印日历
        printMonth(year,month);
    }

    /**判断是否为正确输入*/
    public static boolean isRightInput(int year,int month){
        boolean isRightInput = false;

        if (year >= 1800 && (month >= 1 && month <= 12))
            isRightInput = true;
        else System.out.println("Wrong input");

        return isRightInput;
    }

    public static void printMonth(int year,int month){
        //打印日历表头
        printMonthTitle(year,month);

        //打印日历表体
        printMonthBody(year,month);
    }

    /**打印日历表头*/
    public static void printMonthTitle(int year,int month){
        System.out.println("            " + getMonthName(month) + "  " + year);
        System.out.println("------------------------------------");
        System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n","Sun","Mon","Tue","Wed","Thu","Fri","Sat");
    }

    /**打印日历数据*/
    public static void printMonthBody(int year,int month){
        int startDay = getStartDay(year,month);//开始日期
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year,month);//一个月的天数
        //打印空格
        for (int i = 0 ;i < startDay ; i++){
            System.out.printf("%5s","     ");
        }

        //打印日期
        for (int j = 0 ; j < numberOfDaysInMonth ; j++){
            System.out.printf("%5d",j + 1);

            if ((startDay + j + 1) % 7 == 0)
                System.out.println();
        }
    }

    /**将日期数字转化为英文名称*/
    public static String getMonthName(int month){
        String s = "";

        switch (month){
            case 1: s = "January";break;
            case 2: s = "February";break;
            case 3: s = "March";break;
            case 4: s = "April";break;
            case 5: s = "May";break;
            case 6: s = "June";break;
            case 7: s = "July";break;
            case 8: s = "August";break;
            case 9: s = "September";break;
            case 10: s = "October";break;
            case 11: s = "November";break;
            case 12: s = "December";break;
            default: break;
        }

        return s;
    }

    /**一个月有多少天*/
    public static int getNumberOfDaysInMonth(int year,int month){
        int numberOfDay = 0;

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            numberOfDay = 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            numberOfDay = 30;
        else if (month == 2){
            if (isLeapYear(year))
                numberOfDay = 29;
            else
                numberOfDay = 28;
        }

        return numberOfDay;
    }

    /**判断是否为闰年*/
    public static boolean isLeapYear(int year){
        boolean isLeapYear ;
        //判断是否为闰年
        isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        return isLeapYear;
    }

    public static int getTotalNUmberOfDays(int year,int month){
        int totalNumberOfDay = 0;
        //得到当年与1800年之间的天数
        for (int i = 1800;i < year;i++){
            boolean isLeapYear = isLeapYear(i);
            if (isLeapYear) {
                totalNumberOfDay += 366;
            }
            else
                totalNumberOfDay += 365;
        }
        //今年输入month之前的天数
        for (int j = 1;j < month;j++) {
            totalNumberOfDay += getNumberOfDaysInMonth(year, j);
        }

        return totalNumberOfDay;
    }

    public static int getStartDay(int year,int month){
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int startDay;

        startDay = (getTotalNUmberOfDays(year,month) + START_DAY_FOR_JAN_1_1800) % 7;

        return startDay;
    }
}
