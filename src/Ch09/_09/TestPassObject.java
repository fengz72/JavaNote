package Ch09._09;

public class TestPassObject {
    public static void main(String[] args){
        //Create a Circle object with radius
        Circle myCircle = new Circle(1);

        //Print areas for radius 1,2,3,4,5
        int n = 5;
        printAreas(myCircle,n);

        System.out.println("\n" + myCircle.getRadius());
        System.out.println(n);
    }

    public static void printAreas(Circle c, int n){
        System.out.println("Radius \t\tArea");
        while (n >= 1){
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            n--;
        }
    }
}
