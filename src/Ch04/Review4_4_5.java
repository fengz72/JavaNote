package Ch04;

public class Review4_4_5 {
    public static void main(String[] args){
        String s1 = "Welcome";
        String s2 = "welcome";
        boolean isEqual = s1.equals(s2);
        boolean isEqual1 = s1.equalsIgnoreCase(s2);
        int x = s1.compareTo(s2);
        int x1 = s1.compareToIgnoreCase(s2);
        boolean b = s1.startsWith("AAA");
        boolean b1 = s1.endsWith("AAA");
        int x2 = s1.length();
        char x3 = s1.charAt(0);
        String s3 = s1.concat(s2);
        String s4 = s1.substring(1);
        String s5 = s1.substring(1,4);
        String s6 = s1.toLowerCase();
        String s7 = s1.toUpperCase();
        String s8 = s1.trim();
        int x4 = s1.indexOf('e');
        int x5 = s1.indexOf("abc");
    }
}
