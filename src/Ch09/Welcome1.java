package Ch09;

import java.awt.geom.Point2D;
import java.security.SecureRandom;
import java.util.Date;
import java.util.Random;


public class Welcome1 {
    boolean a;

    public static void main(String[] args){
        Welcome1 w = new Welcome1();
        System.out.println(w.a);

        //data类
        Date date1 = new Date();
        java.util.Date date = new Date(System.currentTimeMillis());
        System.out.println(date.toString());
        System.out.println(date.getTime());

        //Random类 种子
        Random random = new Random();
        Random random1 = new Random(1);
        System.out.println(random.nextDouble());
        System.out.println(random1.nextInt(100));

        //java.security.SecureRandom
        java.security.SecureRandom secureRandom = new SecureRandom();
        System.out.println(secureRandom.nextInt(100));

        //Point2D

    }
}
