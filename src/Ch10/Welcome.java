package Ch10;

import Ch07.DeckOfCard;

public class Welcome {
    public static void main(String[] args){
        Integer integer = new Integer(12);
        Double d = new Double("12.0");//两种构造方法，int/double  String

        System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);//2147483647 -2147483648
        System.out.println(Float.MIN_VALUE);//1.4E-45 最小正值精度
        System.out.println(Double.MAX_VALUE);//1.7976931348623157E308 最大值

        System.out.println(new Double(12.4).intValue());
        System.out.println(new Integer(12).doubleValue());//返回对象的int，double，long，short，float,byte

        System.out.println(new Double(12.4).compareTo(new Double(12.3)));//return 1
        System.out.println(new Double(12.3).compareTo(new Double(12.3)));//return 0
        System.out.println(new Double(12.3).compareTo(new Double(12.4)));//return -1

        Integer integer1 = Integer.valueOf("11",2);
        System.out.println(integer1.toString());
        System.out.println(Integer.valueOf("12",8));
        System.out.println(Integer.valueOf("13",10));
        System.out.println(Integer.valueOf("1A",16));//Integer.valueOf()静态方法


        Double d1 = Double.parseDouble("11.3");
        System.out.println(d1.toString());//Double.parseDouble()静态方法

        System.out.println(String.format("%x",26));//Dec to Hex
    }
}
