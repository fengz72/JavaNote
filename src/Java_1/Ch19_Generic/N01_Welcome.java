package Java_1.Ch19_Generic;

import java.util.ArrayList;
import java.util.Date;

public class Welcome {
    public static void main(String[] args) {
        ArrayList dates = new ArrayList();
        dates.add(new Date());
        dates.add(new String());

        System.out.println(dates.get(0).toString());
        System.out.println(dates.get(1).toString());

    }
}
