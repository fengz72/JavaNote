package Ch13;

import java.math.BigInteger;

public class SortComparableObjects {
    public static void main(String[] args){
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        java.util.Arrays.sort(cities);
        for (String city: cities)
            System.out.print(city + " ");
        System.out.println();

        BigInteger[] bigIntegers = {new BigInteger("232323232323"),
                new BigInteger("12121212121212"), new BigInteger("989898989898989989")};
        java.util.Arrays.sort(bigIntegers);
        for (BigInteger bigInteger: bigIntegers)
            System.out.println(bigInteger + " ");
    }
}
