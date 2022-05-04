package Ch13;

public class TestRational {
    public static void main(String[] args){
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(1,-2);
        System.out.println(r1.add(r2).toString());
    }
}
