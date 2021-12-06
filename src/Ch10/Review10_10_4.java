package Ch10;

public class Review10_10_4 {
    public static void main(String[] args){
        String s1 = "Welcome";
        String s2 = "welcome";
        String s3 = s1.replace('e','E');
        System.out.println(s3);
        String[] tokens = "Welcome to Java and HTML".split(" ");
        s1 = tokens[0];
        s2 = tokens[1];
        System.out.println(s1 + " " + s2);
    }
}
