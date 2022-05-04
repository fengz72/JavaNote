package Ch09._11;

public class TotalArea {
    public static void main(String[] args){
        Circle[] circles;

        circles = createCircleArray();

        printCircleArray(circles);
    }

    public static Circle[] createCircleArray(){
        Circle[] circles = new Circle[5];

        for (int i = 0; i < circles.length; i++){
            circles[i] = new Circle(Math.random() * 100);
        }

        return circles;
    }

    public static void printCircleArray(Circle[] circles){
        System.out.printf("%-30s%-15s\n","Radius","Area");
        for (int i = 0; i < circles.length; i++){
            System.out.printf("%-30f%-15f\n",circles[i].getRadius(),circles[i].getArea());
        }
        System.out.println("-----------------------------------------");
        System.out.println(sum(circles));

    }

    public static double sum(Circle[] circles){
        double sum = 0;

        for (int i = 0; i < circles.length; i++)
            sum += circles[i].getArea();

        return sum;
    }
}
