package Ch10;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Welcome1 {
    public static void main(String[] args){
        //boxing unboxing 自动装箱和自动拆箱
        Integer intObject = 3 + new Integer(2);
        int x = new Integer(3);

        //BigInteger BigDecimal类 传入的类型为String
        BigInteger bigInteger = new BigInteger("1234455566666667789");
        BigInteger bigInteger1 = new BigInteger("2");
        bigInteger.multiply(bigInteger1);

        BigDecimal bigDecimal = new BigDecimal(1.0);
        BigDecimal bigDecimal1 = new BigDecimal("3");
        BigDecimal bigDecimal2 = bigDecimal.divide(bigDecimal1,20,BigDecimal.ROUND_UP);
        System.out.println(bigDecimal2);

//String类
        //可以用字符数组创建一个字符串
        char[] chars = {'G','o','o','d'};
        String s = new String(chars);

        //String对象不可变
        //驻留字符串

        //replace方法 split方法
        String s1 = "Welcome";
        System.out.println(s1.replace('e','A'));
        System.out.println(s1.replaceFirst("e","AB"));
        System.out.println(s1.replaceAll("e","AB"));

        String s2 = "Java#HTML#Perl";
        String[] strings = s2.split("#");
        for (String e : strings ){
            System.out.print(e);
        }

        String s3 = String.format("%7.2f",45.556);
        System.out.println(s3);//四舍五入了

        //StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Welcome to Java");
        System.out.println(sb.reverse().delete(8,11).replace(11,15,"HTML"));//avaJ ot cleHTML,如果替代的字段不足，会只替换已有的字段

    }
}
