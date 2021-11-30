package Ch04;

import java.util.Locale;

public class Review4_4 {
    public static void main(String[] args){
        String message = "Welcome to Java";
        String s1 = message;
        String s2 = "Programing is fun";
        String s3 = message;
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s2.compareTo(s2));
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf("j"));
        System.out.println(s1.indexOf("to"));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.lastIndexOf('o',15));
        System.out.println(s1.length());
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5,11));
        System.out.println(s1.startsWith("Wel"));
        System.out.println(s1.endsWith("Java"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat(s2));
        System.out.println(s1.contains(s2));
        System.out.println("\t Wel \t".trim());

    }
}
