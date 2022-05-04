package Ch04;

public class Welcome {
    public static void main(String[] args) {
        double a = Math.toDegrees(Math.PI / 2);
        double b = Math.toRadians(60);
        double c = Math.sin(Math.PI / 2);
        double d = Math.cos(Math.PI / 4);
        double e = Math.atan(90);
        double f = Math.exp(2);
        double g = Math.log(Math.PI);
        double h = Math.sqrt(4);
        double i = Math.ceil(3.1);//4
        double j = Math.floor(3.1);//3
        double k = Math.rint(4.5);//4  3.5 = 4.0
        double l = Math.round(-2.6f);
        double m = Math.max(2, 3);
        double n = Math.min(2, 3);
        double o = Math.abs(-2.1);
        System.out.println(l);
        System.out.print("\\");
        char a1 = '8';
        int a2 = 0xAB01;
        char a3 = '\u0f41';
        System.out.println(a3);
        System.out.println(Character.isDigit('c'));
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetterOrDigit('c'));
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.toLowerCase('c'));
        System.out.println(Character.toUpperCase('c'));
        //String
        String message = "Welcome to Java";
        System.out.println(message.length());
        System.out.println("Welcome to Java".length());
        System.out.println("".length());
        char b1 = message.charAt(14);
        System.out.println(b1);
        //concat
        String b2 = message.concat(message);
        String b3 = "Welcome to Java" + "Welcome to Java";
        message += "Welcome to Java";
        System.out.println("i + j is " + i + j);
        //toLowerCase,toUpperCase,trim

    }
}
