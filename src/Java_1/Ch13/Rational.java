package Ch13;

public class Rational extends Number implements Comparable<Rational>{

    private long numerator;
    private long denominator;

    public Rational(){
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;//将分母变为正的，用分子控制正负
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    private static long gcd(long numerator, long denominator){
        long n1 = Math.abs(numerator);
        long n2 = Math.abs(denominator);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++){
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }

        return gcd;
    }

    public Rational add(Rational rational){
        return new Rational(numerator * rational.getDenominator() + denominator * rational.getNumerator(),
                denominator * rational.getDenominator());
    }

    public Rational subtract(Rational rational){
        return new Rational(numerator * rational.denominator - denominator * rational.numerator,
                denominator * rational.denominator);
    }

    public Rational multiply(Rational rational){
        return new Rational(numerator * rational.getNumerator(),
                denominator * rational.getDenominator());
    }

    public Rational divide(Rational rational){
        return new Rational(numerator * rational.getDenominator(),
                denominator * rational.numerator);
    }

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 1)
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if ((this.subtract((Rational)obj)).getNumerator() == 0)
            return true;
        else
            return false;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override
    public String toString() {
        if (denominator == 1)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }
}
