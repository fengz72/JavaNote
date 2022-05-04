package Ch04;

public class Review4_4_2 {
    public static void main(String[] args){
        String s1 = "Beijing";
        String s2 = "Welcome";
        String s = "Welcome to Java";
        String s3 = s1 + s2;
        char s4 = s1.charAt(0);
        char s5 = s1.charAt(s1.length() - 1);
        System.out.println(s5);
        System.out.println('1' + 1 + 1);
        System.out.println(1 + "Welcome" + ('\u0001' + 1));
        System.out.println(1 + "Welcome" + 'a' + 1);
    }
}
