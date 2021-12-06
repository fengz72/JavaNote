package Ch10;

public class Review10_10_1 {
    public static void main(String[] args){
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s3));
    }
}
