package Ch09;

import java.util.GregorianCalendar;

public class Ch09_05 {
    public static void main(String[] args){
        java.util.GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.getTime());
        System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println(gregorianCalendar.get(GregorianCalendar.MONTH));
        System.out.println(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));

        gregorianCalendar.setTimeInMillis(1234567898765L);
        System.out.println(gregorianCalendar.getTime());
        System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println(gregorianCalendar.get(GregorianCalendar.MONTH));
        System.out.println(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
