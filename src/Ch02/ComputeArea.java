package Ch02;

public class ComputeArea {
    public static void main(String[] args) {
        double radius;//Declare radius
        double area;//Declare area

        //Assign a radius
        radius = 20;//New value is radius

        //Compute area
        area = radius * radius * 3.1415926;

        //Display results
        System.out.println("The area for the circle of radius" + radius + " is " + area);
    }
}
