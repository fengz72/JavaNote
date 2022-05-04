package Ch11;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public static void main(String[] args){
        Circle circle = new Circle(1);
        GeometricObject geometricObject = new GeometricObject();

        boolean b1 = circle instanceof GeometricObject;
        boolean b2 = geometricObject instanceof Circle;
        boolean b3 = circle instanceof Circle;

        GeometricObject geometricObject1 = circle;
    }
}
