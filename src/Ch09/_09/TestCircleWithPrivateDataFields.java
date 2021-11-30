package Ch09._09;

public class TestCircleWithPrivateDataFields {
    public static void main(String[] args){
        Circle myCircle = new Circle();
        System.out.println(myCircle.getRadius() + " " + myCircle.getArea());

        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println(myCircle.getRadius() + " " + myCircle.getArea());

        System.out.println(Circle.getNumberOfObjects());
    }
}
