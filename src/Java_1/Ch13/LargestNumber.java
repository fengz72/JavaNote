package Ch13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<java.lang.Number> list = new ArrayList<>();
//        list.add(45);
//        list.add(3445.53);
        list.add(new BigDecimal("3432323234344343101"));
        list.add(new BigDecimal("3432323234344343102"));
        list.add(new BigDecimal("2.0909090989081343433344343"));

        System.out.println(getLargestNumber(list));

    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0)
            return null;

        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++)
//            if (number.doubleValue() < list.get(i).doubleValue())
//                number = list.get(i);
            if (((BigDecimal)number).compareTo((BigDecimal)(list.get(i))) < 0)
                number = list.get(i);

        return number;
    }
}
