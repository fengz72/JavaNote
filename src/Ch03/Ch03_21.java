package Ch03;


public class Ch03_21 {
    public static void main(String[] args){
        //Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("请输入年：");
        int year = input.nextInt();
        System.out.print("请输入月：");
        int month = input.nextInt();
        System.out.print("请输入天：");
        int day = input.nextInt();
        //转换
        switch (month){
            case 1:{
                month = 13;
                year = year - 1;
                break;
            }
            case  2:{
                month = 14;
                year = year -1;
                break;
            }
        }
        //计算
        int h = (day + 26 * (month + 1) / 10 + year % 100 + (year % 100) / 4 + year / 100 / 4 + 5 * (year / 100)) % 7;
        switch (h){
            case 0:{
                System.out.println("Day of week is Saturday");
                break;
            }
            case 1:{
                System.out.println("Day of week is Sunday");
                break;
            }
            case 2:{
                System.out.println("Day of week is Monday");
                break;
            }
            case 3:{
                System.out.println("Day of week is Tuesday");
                break;
            }
            case 4:{
                System.out.println("Day of week is Wednesday");
                break;
            }
            case 5:{
                System.out.println("Day of week is Thursday");
                break;
            }
            case 6:{
                System.out.println("Day of week is Friday");
                break;
            }
        }
    }
}
