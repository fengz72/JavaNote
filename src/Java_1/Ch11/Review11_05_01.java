package Ch11;

public class Review11_05_01 {
    private double radius;

    public static void main(String[] args){
        B1 b1 = new B1(2,2);

        System.out.println(b1.getArea());
    }

    public Review11_05_01(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}

class B1 extends Review11_05_01{
    private double length;

    B1(double radius, double length){
        super(radius);
        this.length = length;
    }

    @Override
    public double getArea(){
        return super.getArea() * length;
    }
}
