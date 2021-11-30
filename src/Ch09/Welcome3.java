package Ch09;

import java.util.Date;

public class Welcome3 {
    public static void main(String[] args){
        java.util.Date[] dates = new Date[10];

        System.out.println(dates[0]);
        dates[0] = new Date();
        System.out.println(dates[0].toString());
    }
}
