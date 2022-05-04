package Ch13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args){
        Calendar calendar = new GregorianCalendar();
        System.out.println(new Date());
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

    }
}
