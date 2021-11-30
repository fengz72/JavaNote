package Ch04;

public class Review4_2_1 {
    public static void main(String[] args){
        double a = Math.sqrt(4);
        double b = Math.sin(2 * Math.PI);
        double d = Math.pow(2,2);
        double e = Math.log(Math.E);
        double h = Math.rint(-2.5);//-2
        double i = Math.ceil(-2.5);//-2
        double j = Math.floor(-2.5);//-3
        float k = Math.round(-2.5f);
        double l = Math.round(-2.5);
        double i1 = Math.toRadians(47);
        double i2 = Math.toDegrees(Math.PI);
        System.out.println(i2);
        int number1 = (int) (Math.random() * 12) + 34 ;
        System.out.println(number1);
        int number2 = (int) (Math.random() * 1000);
        System.out.println(number2);
        double number3 = Math.random() * 51 + 5.5;
        System.out.println(number3);
        double a1 = Math.log(Math.exp(5.5));
        System.out.println(a1);
        double a2 = Math.exp(Math.log(5.5));
        System.out.println(a2);
        char letter = 'A';
        char number = '4';
        letter = '\u0041';
        System.out.println(++letter);
    }
}
