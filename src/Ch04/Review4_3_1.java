package Ch04;

public class Review4_3_1 {
    public static void main(String[] args){
        byte a1 = '1';
        byte a2 = 'A';
        byte a3 = 'B';
        byte a4 = 'a';
        byte a5 = 'b';
        System.out.println(a1 + " " + a2 + " " + " " + a3 + " " + a4 +" " + a5);
        char b1 = 40;
        char b2 = 59;
        char b3 = 79;
        char b4 = 85;
        char b5 = 90;
        System.out.println(b1 + " " + b2 + " "  + b3 + " " + b4 +" " + b5);
        char c1 = '1';
        char c2 = '\u3fFa';
        char c3 = '\b';
        char c4 = '\t';
        char d1 = '\\';
        char d2 = '\"';
        //4.3.4
        int i = '1';
        int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
        int k = 'a';
        char c = 90;
        System.out.println(i + " " + j + " "  + k + " " + c );
        //4.3.5
        char e1 = 'A';
        int e2 = (int) e1;

        float e3 = 100.34f;
        int e4 = (int)e3;

        double e5 = 100.34;
        int e6 = (int) e5;

        int e7 = 97;
        char e8 = (char)e7;
        //4.3.6
        char f1 = 'a';
        char f2 = 'c';
        System.out.println(++f1);
        System.out.println(f2++);
        System.out.println(f1 - f2);
        //4.3.7
        int g1 = 97 + (int)(Math.random() * 27);
        char g2 = (char)g1;
        System.out.println(g2);
        //4.3.8
        System.out.println('a'<'b');
        System.out.println('a'<= 'A');
        System.out.println('a' > 'b');
        System.out.println('a' >= 'A');
        System.out.println('a' == 'a');
        System.out.println('a' != 'b');
    }
}
