package Ch09._10_3;

import java.util.Date;

public class Test {
    public static void main(String[] args){
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }

    public static void m1(Date date){
        date = null;
    }
}
