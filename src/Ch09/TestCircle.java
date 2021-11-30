package Ch09;

public class TestCircle {
    public static void main(String[] args){
        Circle circle1 = new Circle();
        System.out.println(circle1.getArea() + " " + circle1.getPerimeter());

        Circle circle2 = new Circle(25);
        System.out.println(circle2.getArea() + " " + circle2.getPerimeter());

        Circle circle3 = new Circle(50);
        System.out.println(circle3.getArea() + " " + circle3.getPerimeter());

        circle2.radius = 20;
        System.out.println(circle2.getArea() + " " + circle2.getPerimeter());
    }
}

class Circle{
    double radius;

    Circle(){
        radius = 1;
    }

    Circle(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }
}