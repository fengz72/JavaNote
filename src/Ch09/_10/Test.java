package Ch09._10;

public class Test {
    public static void main(String[] args){
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);

        swap1(c1,c2);
        System.out.println(c1.radius + " " + c2.radius);

        swap2(c1,c2);
        System.out.println(c1.radius + " " + c2.radius);
    }

    public static void swap1(Circle x, Circle y){
        Circle temp = x;
        x = y;
        y = temp;
    }

    public static void swap2(Circle x, Circle y){
        double temp = x.radius;
        x.radius = y.radius;
        y.radius = temp;
    }

}

class Circle{
    double radius;

    Circle(double newRadius){
        radius = newRadius;
    }
}
