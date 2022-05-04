package Ch11.Review11_10_02;

public class Test {
    public static void main(String[] args){
        Object circle1 = new Circle();
        Object circle2 = new Circle();
        System.out.println(((Circle)circle1).getRadius());
        System.out.println(((Circle)circle2).getRadius());
        System.out.println(circle1.equals(circle2));
    }
}
