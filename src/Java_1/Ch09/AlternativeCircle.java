package Ch09;

public class AlternativeCircle {

    public static void main(String[] args) {
        AlternativeCircle circle1 = new AlternativeCircle();
        System.out.println(circle1.getArea() + " " + circle1.getPerimeter());

        AlternativeCircle circle2 = new AlternativeCircle(25);
        System.out.println(circle2.getArea() + " " + circle2.getPerimeter());

        AlternativeCircle circle3 = new AlternativeCircle(50);
        System.out.println(circle3.getArea() + " " + circle3.getPerimeter());

        circle2.radius = 20;
        System.out.println(circle2.getArea() + " " + circle2.getPerimeter());
    }


    double radius;

    AlternativeCircle() {
        radius = 1;
    }

    AlternativeCircle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }

}
